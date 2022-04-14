public class Data
{
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0)
      {
         return sum / objects.length;
      }
      else
      {
         return 0;
      }
   }

   public static double max(Measurable[] objects)
   {
      if (objects.length == 0)
      {
         return 0;
      }
      //Measurable max = objects[0];
      double max = 0;
      for (Measurable obj : objects)
      {
         if (obj.getMeasure() > max)
         {
            max = obj.getMeasure();
         }
      }

      return max;
   }
}
