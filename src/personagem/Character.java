package personagem;

public abstract class Character {

    // Atributos comuns a todos os personagens
    protected String name;
    protected int level;
    protected int xp;
    //// atributos dependentes
    protected int hp;
    protected int atack;
    protected int speed;
    protected int defense;
    protected int power;
    //protected Skill[] skill = new Skill[2];
    protected int[] attributes = new int[6];
    protected final String[] attrNames = new String[6];

    public Character(String name){
        this.name = name;
        this.hp = 400;
        this.xp = 0;
        this.level = 1;
        for (int i=0; i<=5; i++)
            this.attributes[i] = 100;
        this.attrNames[0] = "Força";
        this.attrNames[1] = "Destreza";
        this.attrNames[2] = "Agilidade";
        this.attrNames[3] = "Inteligência";
        this.attrNames[4] = "Sorte";
        this.attrNames[5] = "Vitalidade";
        this.power = 100;
    }

    /* getters and stters */
    public String getName(){return name;}
    public String setName(String name){return this.name = name;}

    public int getLevel(){return level;}
    public int setLevel(int level){return this.level = level;}

    public int getXp(){return xp;}
    public int setXp(int xp){return this.xp = xp;}

    public int getHp(){return hp;}
    public void setHp(int hp){this.hp = hp;}
    
    public String[] getAttrNames() {return this.attrNames;}

    public int[] getAttributes(){return attributes;}
    public int[] setAttributes(){return attributes;}

    public int getAttribute(int index){return attributes[index];}
    public int setAttribute(int index, int setAttribute){return attributes[index] = setAttribute;}

    public int getAtack() {return atack;}
    public void setAtack(int a) {this.atack = a;}

    public int getSpeed() {return speed;}
    public void setSpeed(int v) {this.speed = v;}

    public int getDefesa() {return defense;}
    public void setDefesa(int d) {this.defense = d;}

    public int getPower(){return power;}
    public int setPower(int p){return this.power = p;}

    /* incrementador de atributos */
    public void incrAttribute(int index, int value){
        attributes[index] += value;
    }
    

    public void showAttributes() {
        for (int i=0; i<6; i++){
            System.out.printf("[%d] %5s = %d\n", i+1, this.attrNames[i], this.attributes[i]);
        }
    }

    // aumenta de nível:
    public void levelUp(){
        this.level++;
    }
    
    // battle methods
    
    public int atack(Character enemy) {
    	/* Retorna o dano causado no inimigo
    	 * Teste: o dano é o ataque menos 10% da defesa do inimmigo */
    	int damage = this.getAtack() - (int) (enemy.getDefesa() / 10);
    	return damage;
    }
}