
public class contenedor
{
  public static boolean SumaGrupo(int[] nums, int target) {
    return SumaGrupo(0, nums, target);
 }
  public static boolean SumaGrupo(int start, int[] nums, int target) {
     if(start>=nums.length){
   return target==0;
   } else 
    return SumaGrupo(start+1,nums,target) || 
    SumaGrupo(start+1,nums,target-nums[start]);
 }

}
