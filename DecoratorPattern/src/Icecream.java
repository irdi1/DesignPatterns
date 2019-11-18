public interface Icecream {
    public String makeIcecream();


    public class SimpleIcecream implements Icecream {
        @Override
        public String makeIcecream() {
            return "Base Icecream";
        }

    }
    abstract class IcecreamDecorator implements Icecream {

        protected Icecream specialIcecream;
        public IcecreamDecorator(Icecream specialIcecream){
            this.specialIcecream = specialIcecream;
        }

        public String makeIcecream(){
            return specialIcecream.makeIcecream();
        }

    }

    public class NuttyDecorator extends IcecreamDecorator {
        public NuttyDecorator(Icecream specialIcecream){
            super(specialIcecream);
        }
        public String makeIcecream(){
            return specialIcecream.makeIcecream() + addNuts();
        }

        private String addNuts(){
            return " + crusty nuts";
        }
    }

    public class honeyDecorator extends IcecreamDecorator {
        public honeyDecorator(Icecream specialIcecream){
            super(specialIcecream);
        }

        public String makeIcecream(){
            return specialIcecream.makeIcecream() + addHoney();
        }

        private String addHoney(){
            return " + Sweet Honey";
        }
    }

}