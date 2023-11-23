public class TestArabToRoman {
        public TestArabToRoman(){
                //
        }
        public boolean oneToI(){
                ArabToRoman ar = new ArabToRoman(1);
                String val =  ar.convert();
                if(!val.equals("I"))
                {
                        throw new AssertionError("Test 1 failled");
                };
                System.out.println(true);
                return true;
        }

        public boolean oneToII(){
                ArabToRoman ar = new ArabToRoman(2);
                String val =  ar.convert();
                if(!val.equals("II"))
                {
                        throw new AssertionError("Test 2failled");
                };
                System.out.println(true);
                return true;
        }

        public boolean oneToIII(){
                ArabToRoman ar = new ArabToRoman(3);
                String val =  ar.convert();
                if(!val.equals("III"))
                {
                        throw new AssertionError("Test 3 failled");
                };
                System.out.println(true);
                return true;
        }

       public boolean oneToIV(){
                ArabToRoman ar = new ArabToRoman(4);
                String val =  ar.convert();
                if(!val.equals("IV"))
                {
                        throw new AssertionError("Test 4 failled");
                };
                System.out.println(true);
                return true;
        }


        public boolean oneToV(){
                ArabToRoman ar = new ArabToRoman(5);
                String val =  ar.convert();
                if(!val.equals("V"))
                {
                        throw new AssertionError("Test 5 failled");
                };
                System.out.println(true);
                return true;
        }

        public boolean oneToVI(){
                ArabToRoman ar = new ArabToRoman(6);
                String val =  ar.convert();
                if(!val.equals("VI"))
                {
                        throw new AssertionError("Test 5 failled");
                };
                System.out.println(true);
                return true;
        }public boolean oneToVII(){
                ArabToRoman ar = new ArabToRoman(7);
                String val =  ar.convert();
                if(!val.equals("VII"))
                {
                        throw new AssertionError("Test 5 failled");
                };
                System.out.println(true);
                return true;
        }public boolean oneToVIII(){
                ArabToRoman ar = new ArabToRoman(8);
                String val =  ar.convert();
                System.out.println(val);
                if(!val.equals("VIII"))
                {
                        throw new AssertionError("Test 5 failled");
                };
                System.out.println(true);
                return true;
        }public boolean oneToIX(){
                ArabToRoman ar = new ArabToRoman(9);
                String val =  ar.convert();
                if(!val.equals("IX"))
                {
                        throw new AssertionError("Test 5 failled");
                };
                System.out.println(true);
                return true;
        }


        public boolean oneToX(){
                ArabToRoman ar = new ArabToRoman(10);
                String val =  ar.convert();
                if(!val.equals("X"))
                {
                        throw new AssertionError("Test 5 failled");
                };
                System.out.println(true);
                return true;
        }


        public boolean oneToXX(){
                ArabToRoman ar = new ArabToRoman(50);
                String val =  ar.convert();
                System.out.println(val);
                if(!val.equals("XXXXX"))
                {
                        throw new AssertionError("Test 5 failled");
                };
                System.out.println(true);
                return true;
        }


}
