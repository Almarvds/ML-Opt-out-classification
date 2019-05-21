
import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;
import java.util.Set;

public class test_class extends PApplet
{
    Item item1 = new Item(null,null,null,null);
    Item item2 = new Item(null,null,null,null);
    Item item3 = new Item(null,null,null,null);
    ItemSelector itemSelector;

    //code elements
    boolean loadedImages;
    boolean firstOneDone;
    boolean finished;
    int imageSize = 300;

    public static void main(String[]args){
        PApplet.main("test_class",args);
    }

    public void settings(){
        size(1152,864);
    }

    public void setup(){
        PImage backgroundRoom = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\rooms\\Room1.jpg");
        background(backgroundRoom);
        noStroke();
        fill(0,0,0,180);
        rect(0,0,width,height);
        fill(30,30,30);
        rect(0,0,width,60);

        setUserProfile();
        System.out.println("finished setup");
    }

    public void setUserProfile(){
        itemSelector = new ItemSelector();
        loadChairs();
        System.out.println("loaded chair images");
        loadCouches();
        System.out.println("loaded couch images");
        itemSelector.AssignChairs();
        System.out.println("Assigned chair values");
        setItem(itemSelector.couch_gnb,0);
        setItem(itemSelector.couch_brnb,1);
        setItem(itemSelector.chair_bnm,2);
    }

    public void loadChairs(){

        itemSelector.chair_Bnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\\\chair bnb.jpg");
        itemSelector.chair_Bnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair bnm.jpg");

        itemSelector.chair_Brnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair brbrb.jpg");
        itemSelector.chair_Brnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair brnm.jpg");
        itemSelector.chair_Brnc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair brnc.jpg");

        itemSelector.chair_Gnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair gnb.jpg");
        itemSelector.chair_Gnc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair gnc.jpg");
        itemSelector.chair_Gnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair gnm.jpg");

        itemSelector.chair_Grbrc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair grbrc.jpg");
        itemSelector.chair_Grnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair grnm.jpg");

        itemSelector.chair_Pinb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair pinb.jpg");
        itemSelector.chair_Pinc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair_pinc.jpg");
        itemSelector.chair_Pinm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair_pinm.jpg");

        itemSelector.chair_Punb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair_punb.jpg");
        itemSelector.chair_Punc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair_punc.jpg");

        itemSelector.chair_Yenb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair yenb.jpg");
        itemSelector.chair_Yenc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair yenc.jpg");
        itemSelector.chair_Yenm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair yenm.jpg");

        itemSelector.chair_Rnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair rnm.jpg");
        itemSelector.chair_Rbb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair rbb.jpg");

    }

    public void loadCouches(){
        itemSelector.couch_Bnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_bnb.jpg");
        itemSelector.couch_Bnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_bnm.jpg");

        itemSelector.couch_Brnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch brnb.jpg");
        itemSelector.couch_Brnc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch brnc.jpg");

        itemSelector.couch_Yenb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch yenb.jpg");
        itemSelector.couch_Yenm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch yenm.jpg");

        itemSelector.couch_Gnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_gnb.jpg");
        itemSelector.couch_Gnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_gnm.jpg");

        itemSelector.couch_Grnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_grnm.jpg");

        itemSelector.couch_Pinb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_pinb.jpg");
        itemSelector.couch_Pinc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_pinc.jpg");

        itemSelector.couch_Punb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_punb.jpg");
        itemSelector.couch_Punc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_punc.jpg");

        itemSelector.couch_Rnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_rnb.png");
        itemSelector.couch_Rnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_rnm.jpg");
    }

    public void draw(){

        drawItem();

        //check mouse for hovering the items

        if((mouseY>(height-imageSize)/2 && mouseY<((height-imageSize)/2)+imageSize)&&!finished){
            fill(255,255,255,150);
            {
                for(int i=0;i<3;i++){
                    if(mouseX>(width-(3*imageSize))/4 + ((imageSize+(width-(3*imageSize))/4)*i) && mouseX<
                            (width-(3*imageSize))/4 + ((imageSize+(width-(3*imageSize))/4)*i)+imageSize){
                        rect((width-(3*imageSize))/4 + ((imageSize+(width-(3*imageSize))/4)*i), (height-imageSize)/2, imageSize, imageSize);
                    }
                }
            }
        }

    }

    private void drawItem() {
        fill(0);
        rect((width-(3*imageSize))/4 - 3, (height-imageSize)/2 - 3,imageSize + 6, imageSize + 6, 2);
        image(item1.itemImage, (width-(3*imageSize))/4, (height-imageSize)/2, imageSize, imageSize);

        rect((((width-(3*imageSize))/4)*2)+imageSize - 3, (height-imageSize)/2 - 3,imageSize + 6, imageSize + 6, 2);
        image(item2.itemImage, (((width-(3*imageSize))/4)*2)+imageSize, (height-imageSize)/2, imageSize, imageSize);

        rect(width-imageSize-(width-(3*imageSize))/4 - 3, (height-imageSize)/2 - 3,imageSize + 6, imageSize + 6, 2);
        image(item3.itemImage, width-imageSize-(width-(3*imageSize))/4, (height-imageSize)/2, imageSize, imageSize);
    }

    public void mousePressed(){
        if((mouseY>(height-imageSize)/2 && mouseY<((height-imageSize)/2)+imageSize)&& !finished){
            {
                for(int i=0;i<3;i++){
                    if(mouseX>(width-(3*imageSize))/4 + ((imageSize+(width-(3*imageSize))/4)*i) && mouseX<
                            (width-(3*imageSize))/4 + ((imageSize+(width-(3*imageSize))/4)*i)+imageSize){
                        ItemPressed(i);
                    }
                }
            }
        }
    }

    //draw congratulations
    void drawCongratulations(){
        textAlign(CENTER);
        textSize(20);
        fill(255);
        text("Congratulations, you found the red chair!",width/2,(((height-imageSize)/2)+imageSize)+((height-imageSize)/4));
    }

    void ItemPressed(int Option) {
        Item item = null;
        if(Option == 0){ item = item1; }
        if(Option == 1){ item = item2; }
        if(Option == 2){ item = item3; }

        if(item == itemSelector.chair_rnm || item == itemSelector.chair_rbb){
            drawCongratulations();
            finished = true;
        }

        if(!finished){
            Item[] items = itemSelector.ItemChosen(item);
            for (int i = 0; i < 3; i++) {
                setItem(items[i], i);
            }
        }
    }

    void setItem(Item SetItem, int itemNumber){
        System.out.println(SetItem);
        System.out.println("setting new item");
        if(itemNumber == 0){item1 = SetItem;}
        if(itemNumber == 1){item2 = SetItem;}
        if(itemNumber == 2){item3 = SetItem;}
        System.out.println("new item set");
    }

}
