package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class phawalkf {

static String TextureName = "walk";

static int Vertices = 341;

static int VertTexts = 191;

static int Normals = 106;

static int Faces = 196;

static int FacesB = 30;

static int SmoothGroups = 2;

static float VertArray[] = new float[]{
 1.253206f, 7.907886f, 1.366990f,
 0.868666f, 9.583723f, 1.519208f,
 0.764446f, 9.123755f, 0.173424f,
 0.820442f, 8.198734f, -0.060814f,
 0.491709f, 9.654794f, 1.551368f,
 0.408353f, 9.521520f, 0.099916f,
 0.380701f, 8.028180f, -0.168030f,
 0.422931f, 7.885528f, 1.352310f,
 0.009626f, 7.848011f, 1.623861f,
 -0.042195f, 9.804445f, 1.615804f,
 -0.006456f, 9.675554f, 0.106742f,
 0.045245f, 8.027513f, -0.262369f,
 -0.030501f, 9.981270f, 0.850238f,
 0.479363f, 9.893286f, 0.851493f,
 0.872474f, 9.603045f, 1.317388f,
 0.921707f, 7.923405f, 1.102786f,
 0.416466f, 7.916220f, 1.025993f,
 0.021075f, 7.905713f, 1.017527f,
 0.428931f, 7.627130f, 1.523134f,
 0.765435f, 7.633317f, 1.559464f,
 0.425774f, 7.288638f, 1.500576f,
 0.774203f, 7.291655f, 1.574013f,
 1.217694f, 7.667084f, -0.040324f,
 0.771669f, 7.625984f, 1.005081f,
 0.029473f, 7.639973f, 0.955152f,
 0.053380f, 7.645943f, -0.168738f,
 0.700363f, 4.677358f, 0.108029f,
 0.684600f, 4.677358f, 0.804733f,
 0.033961f, 4.677366f, 0.976895f,
 0.033961f, 4.677366f, -0.297162f,
 0.972507f, 6.695516f, 1.131151f,
 0.996786f, 6.716788f, -0.021791f,
 0.033081f, 6.888426f, -0.172517f,
 0.035139f, 6.785598f, 1.371735f,
 1.975550f, 0.144083f, 0.061946f,
 0.888789f, 0.043316f, 2.012642f,
 -0.813829f, -0.031716f, 1.651791f,
 0.789159f, 0.135550f, -1.328827f,
 1.457664f, 7.193051f, 0.122957f,
 1.425330f, 7.427093f, 0.797685f,
 1.105841f, 6.984492f, 1.055725f,
 1.138692f, 6.716034f, 0.275556f,
 2.462569f, 5.748613f, 0.810190f,
 2.429095f, 6.053066f, 1.001138f,
 2.130753f, 6.048801f, 1.063568f,
 2.168633f, 5.698355f, 0.840980f,
 2.837693f, 4.510737f, 2.325824f,
 2.769573f, 5.140664f, 2.725814f,
 2.173067f, 5.152915f, 2.781740f,
 2.248508f, 4.448027f, 2.330256f,
 -0.264179f, 2.370293f, 1.564968f,
 0.866995f, 2.326568f, 1.707594f,
 1.237480f, 2.353108f, 0.310098f,
 0.231489f, 2.396982f, -0.371687f,
 -0.931279f, 9.555109f, 1.278764f,
 -0.882047f, 7.875469f, 1.064162f,
 -0.745860f, 8.157109f, -0.094353f,
 -0.749123f, 9.083532f, 0.141014f,
 -0.411830f, 9.499722f, 0.082354f,
 -0.534560f, 9.866340f, 0.829782f,
 -0.293501f, 8.010262f, -0.182467f,
 -0.374315f, 7.895205f, 1.009060f,
 -0.393093f, 7.863842f, 1.334837f,
 -1.223252f, 7.842073f, 1.313962f,
 -0.935087f, 9.535788f, 1.480584f,
 -0.564156f, 9.626733f, 1.528759f,
 -0.730272f, 7.593567f, 1.527436f,
 -0.392669f, 7.605295f, 1.505541f,
 -0.370584f, 7.267475f, 1.483523f,
 -0.721504f, 7.251906f, 1.541986f,
 -0.712388f, 7.586545f, 0.973303f,
 -1.114839f, 7.605096f, -0.090271f,
 -1.803614f, 3.832057f, -0.873407f,
 -2.413230f, 4.068260f, -0.507324f,
 -2.175260f, 4.135947f, 0.038465f,
 -1.490283f, 3.874220f, -0.372271f,
 -0.902728f, 6.694263f, 1.133546f,
 -0.930008f, 6.715500f, -0.019331f,
 -0.616678f, 4.677358f, 0.804733f,
 -0.632440f, 4.677358f, 0.108029f,
 -1.335520f, 2.413394f, 1.149010f,
 -0.987038f, 2.416056f, -0.315775f,
 -1.521649f, 7.254034f, 0.457026f,
 -0.902577f, 7.349407f, 0.112450f,
 -1.431634f, 6.709925f, 0.702784f,
 -0.714506f, 6.821607f, 0.309000f,
 -1.735698f, 5.903878f, -0.814514f,
 -1.442811f, 5.788132f, -0.990845f,
 -1.631872f, 5.908075f, -0.527936f,
 -1.292678f, 5.776711f, -0.731612f,
 -2.078240f, -0.055396f, 0.479610f,
 -1.046911f, 0.030246f, -1.558571f,
 2.185488f, 5.409705f, 2.193267f,
 2.608999f, 5.415760f, 2.104644f,
 2.656517f, 4.983574f, 1.833585f,
 2.239262f, 4.912230f, 1.877292f,
 -1.970786f, 4.700677f, -0.188837f,
 -1.489284f, 4.514201f, -0.477965f,
 -1.702404f, 4.530413f, -0.845958f,
 -2.118172f, 4.694720f, -0.595646f,
 2.766942f, 1.412218f, -0.752686f,
 2.834266f, 0.971280f, -0.118076f,
 2.303275f, 10.140059f, 4.552085f,
 2.079381f, 8.859287f, 6.298286f,
 2.278788f, 8.165702f, 3.991532f,
 2.346112f, 7.724764f, 4.626142f,
 0.764446f, 9.123755f, 0.173424f,
 0.764446f, 9.123755f, 0.173424f,
 0.872474f, 9.603045f, 1.317388f,
 0.820442f, 8.198734f, -0.060814f,
 0.380701f, 8.028180f, -0.168030f,
 0.764446f, 9.123755f, 0.173424f,
 0.764446f, 9.123755f, 0.173424f,
 0.380701f, 8.028180f, -0.168030f,
 0.380701f, 8.028180f, -0.168030f,
 -0.042195f, 9.804445f, 1.615804f,
 -0.042195f, 9.804445f, 1.615804f,
 0.491709f, 9.654794f, 1.551368f,
 0.491709f, 9.654794f, 1.551368f,
 0.872474f, 9.603045f, 1.317388f,
 0.872474f, 9.603045f, 1.317388f,
 0.491709f, 9.654794f, 1.551368f,
 0.868666f, 9.583723f, 1.519208f,
 1.253206f, 7.907886f, 1.366990f,
 0.868666f, 9.583723f, 1.519208f,
 0.868666f, 9.583723f, 1.519208f,
 0.416466f, 7.916220f, 1.025993f,
 0.422931f, 7.885528f, 1.352310f,
 0.422931f, 7.885528f, 1.352310f,
 0.009626f, 7.848011f, 1.623861f,
 0.422931f, 7.885528f, 1.352310f,
 0.428931f, 7.627130f, 1.523134f,
 0.428931f, 7.627130f, 1.523134f,
 0.425774f, 7.288638f, 1.500576f,
 0.425774f, 7.288638f, 1.500576f,
 0.425774f, 7.288638f, 1.500576f,
 0.774203f, 7.291655f, 1.574013f,
 1.253206f, 7.907886f, 1.366990f,
 0.765435f, 7.633317f, 1.559464f,
 0.765435f, 7.633317f, 1.559464f,
 0.774203f, 7.291655f, 1.574013f,
 0.416466f, 7.916220f, 1.025993f,
 0.771669f, 7.625984f, 1.005081f,
 0.380701f, 8.028180f, -0.168030f,
 0.380701f, 8.028180f, -0.168030f,
 0.771669f, 7.625984f, 1.005081f,
 1.217694f, 7.667084f, -0.040324f,
 0.029473f, 7.639973f, 0.955152f,
 0.416466f, 7.916220f, 1.025993f,
 0.416466f, 7.916220f, 1.025993f,
 0.029473f, 7.639973f, 0.955152f,
 0.771669f, 7.625984f, 1.005081f,
 0.045245f, 8.027513f, -0.262369f,
 0.380701f, 8.028180f, -0.168030f,
 0.053380f, 7.645943f, -0.168738f,
 0.053380f, 7.645943f, -0.168738f,
 0.380701f, 8.028180f, -0.168030f,
 1.217694f, 7.667084f, -0.040324f,
 0.972507f, 6.695516f, 1.131151f,
 0.684600f, 4.677358f, 0.804733f,
 0.700363f, 4.677358f, 0.108029f,
 0.684600f, 4.677358f, 0.804733f,
 0.684600f, 4.677358f, 0.804733f,
 0.866995f, 2.326568f, 1.707594f,
 0.684600f, 4.677358f, 0.804733f,
 0.033961f, 4.677366f, 0.976895f,
 0.033961f, 4.677366f, 0.976895f,
 0.033961f, 4.677366f, -0.297162f,
 0.700363f, 4.677358f, 0.108029f,
 0.700363f, 4.677358f, 0.108029f,
 0.771669f, 7.625984f, 1.005081f,
 1.217694f, 7.667084f, -0.040324f,
 1.217694f, 7.667084f, -0.040324f,
 0.972507f, 6.695516f, 1.131151f,
 0.771669f, 7.625984f, 1.005081f,
 0.771669f, 7.625984f, 1.005081f,
 0.996786f, 6.716788f, -0.021791f,
 0.972507f, 6.695516f, 1.131151f,
 0.972507f, 6.695516f, 1.131151f,
 1.105841f, 6.984492f, 1.055725f,
 1.217694f, 7.667084f, -0.040324f,
 0.996786f, 6.716788f, -0.021791f,
 0.996786f, 6.716788f, -0.021791f,
 1.105841f, 6.984492f, 1.055725f,
 2.130753f, 6.048801f, 1.063568f,
 2.130753f, 6.048801f, 1.063568f,
 2.130753f, 6.048801f, 1.063568f,
 2.185488f, 5.409705f, 2.193267f,
 2.185488f, 5.409705f, 2.193267f,
 0.866995f, 2.326568f, 1.707594f,
 0.888789f, 0.043316f, 2.012642f,
 0.888789f, 0.043316f, 2.012642f,
 -0.931279f, 9.555109f, 1.278764f,
 -0.749123f, 9.083532f, 0.141014f,
 -0.749123f, 9.083532f, 0.141014f,
 -0.745860f, 8.157109f, -0.094353f,
 -0.749123f, 9.083532f, 0.141014f,
 -0.293501f, 8.010262f, -0.182467f,
 -0.293501f, 8.010262f, -0.182467f,
 -0.749123f, 9.083532f, 0.141014f,
 -0.293501f, 8.010262f, -0.182467f,
 -0.564156f, 9.626733f, 1.528759f,
 -0.042195f, 9.804445f, 1.615804f,
 -0.042195f, 9.804445f, 1.615804f,
 -0.935087f, 9.535788f, 1.480584f,
 -0.564156f, 9.626733f, 1.528759f,
 -0.931279f, 9.555109f, 1.278764f,
 -0.931279f, 9.555109f, 1.278764f,
 -0.564156f, 9.626733f, 1.528759f,
 -0.935087f, 9.535788f, 1.480584f,
 -0.935087f, 9.535788f, 1.480584f,
 -1.223252f, 7.842073f, 1.313962f,
 0.009626f, 7.848011f, 1.623861f,
 -0.393093f, 7.863842f, 1.334837f,
 -0.393093f, 7.863842f, 1.334837f,
 -0.374315f, 7.895205f, 1.009060f,
 -0.393093f, 7.863842f, 1.334837f,
 -0.392669f, 7.605295f, 1.505541f,
 -0.392669f, 7.605295f, 1.505541f,
 -0.370584f, 7.267475f, 1.483523f,
 -0.370584f, 7.267475f, 1.483523f,
 -0.370584f, 7.267475f, 1.483523f,
 -0.721504f, 7.251906f, 1.541986f,
 -0.721504f, 7.251906f, 1.541986f,
 -0.730272f, 7.593567f, 1.527436f,
 -0.730272f, 7.593567f, 1.527436f,
 -1.223252f, 7.842073f, 1.313962f,
 -1.114839f, 7.605096f, -0.090271f,
 -0.712388f, 7.586545f, 0.973303f,
 -0.293501f, 8.010262f, -0.182467f,
 -0.293501f, 8.010262f, -0.182467f,
 -0.712388f, 7.586545f, 0.973303f,
 -0.374315f, 7.895205f, 1.009060f,
 -0.712388f, 7.586545f, 0.973303f,
 0.029473f, 7.639973f, 0.955152f,
 -0.374315f, 7.895205f, 1.009060f,
 -0.374315f, 7.895205f, 1.009060f,
 0.029473f, 7.639973f, 0.955152f,
 0.045245f, 8.027513f, -0.262369f,
 0.053380f, 7.645943f, -0.168738f,
 -0.293501f, 8.010262f, -0.182467f,
 -0.293501f, 8.010262f, -0.182467f,
 0.053380f, 7.645943f, -0.168738f,
 -1.114839f, 7.605096f, -0.090271f,
 -0.902728f, 6.694263f, 1.133546f,
 -0.616678f, 4.677358f, 0.804733f,
 -0.632440f, 4.677358f, 0.108029f,
 -0.616678f, 4.677358f, 0.804733f,
 -0.616678f, 4.677358f, 0.804733f,
 -1.335520f, 2.413394f, 1.149010f,
 -0.616678f, 4.677358f, 0.804733f,};

static float VertArrayB[] = new float[]{
 -0.616678f, 4.677358f, 0.804733f,
 -0.264179f, 2.370293f, 1.564968f,
 0.033961f, 4.677366f, 0.976895f,
 0.231489f, 2.396982f, -0.371687f,
 -0.987038f, 2.416056f, -0.315775f,
 0.033961f, 4.677366f, -0.297162f,
 0.033961f, 4.677366f, -0.297162f,
 -0.987038f, 2.416056f, -0.315775f,
 -0.632440f, 4.677358f, 0.108029f,
 -1.114839f, 7.605096f, -0.090271f,
 -0.902577f, 7.349407f, 0.112450f,
 -0.712388f, 7.586545f, 0.973303f,
 -0.902577f, 7.349407f, 0.112450f,
 -1.521649f, 7.254034f, 0.457026f,
 -0.712388f, 7.586545f, 0.973303f,
 -0.712388f, 7.586545f, 0.973303f,
 -1.521649f, 7.254034f, 0.457026f,
 -0.902728f, 6.694263f, 1.133546f,
 -0.902728f, 6.694263f, 1.133546f,
 -1.521649f, 7.254034f, 0.457026f,
 -1.431634f, 6.709925f, 0.702784f,
 -0.902728f, 6.694263f, 1.133546f,
 -1.431634f, 6.709925f, 0.702784f,
 -0.930008f, 6.715500f, -0.019331f,
 -1.431634f, 6.709925f, 0.702784f,
 -0.714506f, 6.821607f, 0.309000f,
 -0.930008f, 6.715500f, -0.019331f,
 -0.714506f, 6.821607f, 0.309000f,
 -0.902577f, 7.349407f, 0.112450f,
 -0.930008f, 6.715500f, -0.019331f,
 -0.930008f, 6.715500f, -0.019331f,
 -0.902577f, 7.349407f, 0.112450f,
 -1.114839f, 7.605096f, -0.090271f,
 -1.735698f, 5.903878f, -0.814514f,
 -1.631872f, 5.908075f, -0.527936f,
 -1.521649f, 7.254034f, 0.457026f,
 -1.521649f, 7.254034f, 0.457026f,
 -1.631872f, 5.908075f, -0.527936f,
 -1.431634f, 6.709925f, 0.702784f,
 -1.970786f, 4.700677f, -0.188837f,
 -1.631872f, 5.908075f, -0.527936f,
 -2.118172f, 4.694720f, -0.595646f,
 -2.118172f, 4.694720f, -0.595646f,
 -1.631872f, 5.908075f, -0.527936f,
 -1.735698f, 5.903878f, -0.814514f,
 -1.046911f, 0.030246f, -1.558571f,
 -2.078240f, -0.055396f, 0.479610f,
 -0.987038f, 2.416056f, -0.315775f,
 -0.987038f, 2.416056f, -0.315775f,
 -2.078240f, -0.055396f, 0.479610f,
 -1.335520f, 2.413394f, 1.149010f,
 2.656517f, 4.983574f, 1.833585f,
 2.769573f, 5.140664f, 2.725814f,
 2.837693f, 4.510737f, 2.325824f,
 2.239262f, 4.912230f, 1.877292f,
 2.656517f, 4.983574f, 1.833585f,
 2.248508f, 4.448027f, 2.330256f,
 2.248508f, 4.448027f, 2.330256f,
 2.656517f, 4.983574f, 1.833585f,
 2.837693f, 4.510737f, 2.325824f,
 2.185488f, 5.409705f, 2.193267f,
 2.239262f, 4.912230f, 1.877292f,
 2.173067f, 5.152915f, 2.781740f,
 2.173067f, 5.152915f, 2.781740f,
 2.239262f, 4.912230f, 1.877292f,
 2.248508f, 4.448027f, 2.330256f,
 -1.489284f, 4.514201f, -0.477965f,
 -2.175260f, 4.135947f, 0.038465f,
 -1.490283f, 3.874220f, -0.372271f,
 -1.489284f, 4.514201f, -0.477965f,
 -1.490283f, 3.874220f, -0.372271f,
 -1.702404f, 4.530413f, -0.845958f,
 -1.702404f, 4.530413f, -0.845958f,
 -1.490283f, 3.874220f, -0.372271f,
 -1.803614f, 3.832057f, -0.873407f,
 -2.118172f, 4.694720f, -0.595646f,
 -1.702404f, 4.530413f, -0.845958f,
 -2.413230f, 4.068260f, -0.507324f,
 -2.413230f, 4.068260f, -0.507324f,
 -1.702404f, 4.530413f, -0.845958f,
 -1.803614f, 3.832057f, -0.873407f,
 -2.118172f, 4.694720f, -0.595646f,
 -2.413230f, 4.068260f, -0.507324f,
 -1.970786f, 4.700677f, -0.188837f,
 2.766942f, 1.412218f, -0.752686f,
 2.834266f, 0.971280f, -0.118076f,
 2.278788f, 8.165702f, 3.991532f,
 2.278788f, 8.165702f, 3.991532f,
 2.834266f, 0.971280f, -0.118076f,
 2.346112f, 7.724764f, 4.626142f,};

static float[] TextArray = new float[]{
 0.531280f, 0.707589f,
 0.484323f, 0.943805f,
 0.906579f, 0.606627f,
 0.908324f, 0.508558f,
 0.432117f, 0.970430f,
 0.119964f, 0.206787f,
 0.912807f, 0.483165f,
 0.415376f, 0.707589f,
 0.358414f, 0.707589f,
 0.358414f, 0.994176f,
 0.086285f, 0.199997f,
 0.083540f, 0.350365f,
 0.085479f, 0.151978f,
 0.126438f, 0.150934f,
 0.821509f, 0.628783f,
 0.826742f, 0.493028f,
 0.848890f, 0.463714f,
 0.949638f, 0.757239f,
 0.415765f, 0.673932f,
 0.462820f, 0.673932f,
 0.414003f, 0.626649f,
 0.462820f, 0.626649f,
 0.506471f, 0.680776f,
 0.888747f, 0.982432f,
 0.804662f, 0.985869f,
 0.608704f, 0.680777f,
 0.550265f, 0.427741f,
 0.490451f, 0.415698f,
 0.804662f, 0.646870f,
 0.608704f, 0.427351f,
 0.910849f, 0.876410f,
 0.524361f, 0.604524f,
 0.608704f, 0.619762f,
 0.804662f, 0.887183f,
 0.637059f, 0.094341f,
 0.508844f, 0.103073f,
 0.340575f, 0.103073f,
 0.745360f, 0.093609f,
 0.088712f, 0.403165f,
 0.134506f, 0.403165f,
 0.177173f, 0.403165f,
 0.049042f, 0.403165f,
 0.088712f, 0.521627f,
 0.134506f, 0.521627f,
 0.177173f, 0.521627f,
 0.049042f, 0.521627f,
 0.134506f, 0.697341f,
 0.134506f, 0.642886f,
 0.177173f, 0.642886f,
 0.177173f, 0.697341f,
 0.340574f, 0.348630f,
 0.450573f, 0.348630f,
 0.673596f, 0.248044f,
 0.745360f, 0.248156f,
 0.966035f, 0.484735f,
 0.960563f, 0.348968f,
 0.880548f, 0.364100f,
 0.880965f, 0.462579f,
 0.052854f, 0.206348f,
 0.044331f, 0.151978f,
 0.878018f, 0.339363f,
 0.938475f, 0.320998f,
 0.301453f, 0.707589f,
 0.185549f, 0.707589f,
 0.232506f, 0.943805f,
 0.284711f, 0.970430f,
 0.254009f, 0.673932f,
 0.301064f, 0.673932f,
 0.302825f, 0.626649f,
 0.254009f, 0.626649f,
 0.720578f, 0.982432f,
 0.710936f, 0.680776f,
 0.007565f, 0.655407f,
 0.007565f, 0.709862f,
 0.049236f, 0.709862f,
 0.049236f, 0.655407f,
 0.698476f, 0.876410f,
 0.693047f, 0.604524f,
 0.726955f, 0.415697f,
 0.667142f, 0.427741f,
 0.230576f, 0.348630f,
 0.817124f, 0.248044f,
 0.176724f, 0.949583f,
 0.137216f, 0.949583f,
 0.049236f, 0.949583f,
 0.091983f, 0.949583f,
 0.176724f, 0.831121f,
 0.137216f, 0.831121f,
 0.049236f, 0.831121f,
 0.091983f, 0.831121f,
 0.172305f, 0.103073f,
 0.853660f, 0.094340f,
 0.177173f, 0.602466f,
 0.134506f, 0.602466f,
 0.088712f, 0.602466f,
 0.049042f, 0.602466f,
 0.049236f, 0.750282f,
 0.091983f, 0.750282f,
 0.137216f, 0.750282f,
 0.176724f, 0.750282f,
 0.493691f, 0.982654f,
 0.694605f, 0.981109f,
 0.557045f, 0.804122f,
 0.628631f, 0.805010f,
 0.158683f, 0.223498f,
 0.158683f, 0.223498f,
 0.158683f, 0.115418f,
 0.158683f, 0.338207f,
 0.110895f, 0.350972f,
 0.158683f, 0.223498f,
 0.158683f, 0.223498f,
 0.110895f, 0.350972f,
 0.110895f, 0.350972f,
 0.085479f, 0.096280f,
 0.085479f, 0.096280f,
 0.128331f, 0.096280f,
 0.128331f, 0.096280f,
 0.158683f, 0.115418f,
 0.158683f, 0.115418f,
 0.128331f, 0.096280f,
 0.158683f, 0.096281f,
 0.805700f, 0.496787f,
 0.805700f, 0.628774f,
 0.805700f, 0.628774f,
 0.949638f, 0.718017f,
 0.972326f, 0.722391f,
 0.972326f, 0.722391f,
 0.972326f, 0.753767f,
 0.846690f, 0.444907f,
 0.822498f, 0.435909f,
 0.822498f, 0.435909f,
 0.804583f, 0.447868f,
 0.804583f, 0.447868f,
 0.804583f, 0.447868f,
 0.792244f, 0.460353f,
 0.805700f, 0.496787f,
 0.788023f, 0.477981f,
 0.788023f, 0.477981f,
 0.792244f, 0.460353f,
 0.925303f, 0.838421f,
 0.933270f, 0.825273f,
 0.965643f, 0.877787f,
 0.965643f, 0.877787f,
 0.933270f, 0.825273f,
 0.986675f, 0.823739f,
 0.921005f, 0.754538f,
 0.949638f, 0.718017f,
 0.949638f, 0.718017f,
 0.921005f, 0.754538f,
 0.917794f, 0.675968f,
 0.961898f, 0.902588f,
 0.965643f, 0.877787f,
 0.990420f, 0.903796f,
 0.990420f, 0.903796f,
 0.965643f, 0.877787f,
 0.986675f, 0.823739f,
 0.425500f, 0.583551f,
 0.878348f, 0.646869f,
 0.704988f, 0.396285f,
 0.666165f, 0.412442f,
 0.666165f, 0.412442f,
 0.590716f, 0.283014f,
 0.403714f, 0.584799f,
 0.340575f, 0.584800f,
 0.340575f, 0.584800f,
 0.745360f, 0.396794f,
 0.704988f, 0.396285f,
 0.704988f, 0.396285f,
 0.134506f, 0.357626f,
 0.088712f, 0.357626f,
 0.088712f, 0.357626f,
 0.177173f, 0.357626f,
 0.134506f, 0.357626f,
 0.134506f, 0.357626f,
 0.049042f, 0.357626f,
 0.008494f, 0.357626f,
 0.008494f, 0.357626f,
 0.008494f, 0.403165f,
 0.088712f, 0.357626f,
 0.049042f, 0.357626f,
 0.049042f, 0.357626f,
 0.008494f, 0.403165f,
 0.008494f, 0.521627f,
 0.008494f, 0.521627f,
 0.008494f, 0.521627f,
 0.008494f, 0.602466f,
 0.008494f, 0.602466f,
 0.590716f, 0.283014f,
 0.501906f, 0.152852f,
 0.501906f, 0.152852f,
 0.012277f, 0.112730f,
 0.012276f, 0.217993f,
 0.012276f, 0.217993f,
 0.012276f, 0.335387f,
 0.012276f, 0.217993f,
 0.056185f, 0.349758f,
 0.056185f, 0.349758f,
 0.012276f, 0.217993f,
 0.056185f, 0.349758f,
 0.042629f, 0.096280f,
 0.085479f, 0.096280f,
 0.085479f, 0.096280f,
 0.012276f, 0.096281f,
 0.042629f, 0.096280f,
 0.012277f, 0.112730f,
 0.012277f, 0.112730f,
 0.042629f, 0.096280f,
 0.981844f, 0.484725f,
 0.981844f, 0.484725f,
 0.981844f, 0.352739f,
 0.972326f, 0.753767f,
 0.972326f, 0.785142f,
 0.972326f, 0.785142f,
 0.949638f, 0.785658f,
 0.940336f, 0.302313f,
 0.964527f, 0.293316f,
 0.964527f, 0.293316f,
 0.982102f, 0.305398f,
 0.982102f, 0.305398f,
 0.982102f, 0.305398f,
 0.994453f, 0.316738f,
 0.994453f, 0.316738f,
 0.999521f, 0.333933f,
 0.999521f, 0.333933f,
 0.981844f, 0.352739f,
 0.986755f, 0.984311f,
 0.933507f, 0.983693f,
 0.965564f, 0.931307f,
 0.965564f, 0.931307f,
 0.933507f, 0.983693f,
 0.925419f, 0.970619f,
 0.917795f, 0.833109f,
 0.921005f, 0.754538f,
 0.949638f, 0.785658f,
 0.949638f, 0.785658f,
 0.921005f, 0.754538f,
 0.961898f, 0.902588f,
 0.990420f, 0.903796f,
 0.965564f, 0.931307f,
 0.965564f, 0.931307f,
 0.990420f, 0.903796f,
 0.986755f, 0.984311f,
 0.791908f, 0.583549f,
 0.730977f, 0.646869f,
 0.785732f, 0.396285f,
 0.824556f, 0.412442f,
 0.824556f, 0.412442f,
 0.900004f, 0.283013f,
 0.277434f, 0.584799f,};

static float[] TextArrayB = new float[]{
 0.277434f, 0.584799f,
 0.340574f, 0.348630f,
 0.340575f, 0.584800f,
 0.745360f, 0.248156f,
 0.817124f, 0.248044f,
 0.745360f, 0.396794f,
 0.745360f, 0.396794f,
 0.817124f, 0.248044f,
 0.785732f, 0.396285f,
 0.137216f, 0.995122f,
 0.137216f, 0.949583f,
 0.176724f, 0.995122f,
 0.137216f, 0.949583f,
 0.176724f, 0.949583f,
 0.176724f, 0.995122f,
 0.007565f, 0.995122f,
 0.007565f, 0.949583f,
 0.049236f, 0.995122f,
 0.049236f, 0.995122f,
 0.007565f, 0.949583f,
 0.049236f, 0.949583f,
 0.049236f, 0.995122f,
 0.049236f, 0.949583f,
 0.091983f, 0.995122f,
 0.049236f, 0.949583f,
 0.091983f, 0.949583f,
 0.091983f, 0.995122f,
 0.091983f, 0.949583f,
 0.137216f, 0.949583f,
 0.091983f, 0.995122f,
 0.091983f, 0.995122f,
 0.137216f, 0.949583f,
 0.137216f, 0.995122f,
 0.007565f, 0.831121f,
 0.049236f, 0.831121f,
 0.007565f, 0.949583f,
 0.007565f, 0.949583f,
 0.049236f, 0.831121f,
 0.049236f, 0.949583f,
 0.049236f, 0.750282f,
 0.049236f, 0.831121f,
 0.007565f, 0.750282f,
 0.007565f, 0.750282f,
 0.049236f, 0.831121f,
 0.007565f, 0.831121f,
 0.853660f, 0.094340f,
 0.988813f, 0.152851f,
 0.817124f, 0.248044f,
 0.817124f, 0.248044f,
 0.988813f, 0.152851f,
 0.900004f, 0.283013f,
 0.088712f, 0.602466f,
 0.134506f, 0.642886f,
 0.088712f, 0.642886f,
 0.049042f, 0.602466f,
 0.088712f, 0.602466f,
 0.049042f, 0.642886f,
 0.049042f, 0.642886f,
 0.088712f, 0.602466f,
 0.088712f, 0.642886f,
 0.008494f, 0.602466f,
 0.049042f, 0.602466f,
 0.008494f, 0.642886f,
 0.008494f, 0.642886f,
 0.049042f, 0.602466f,
 0.049042f, 0.642886f,
 0.091983f, 0.750282f,
 0.049236f, 0.709862f,
 0.091983f, 0.709862f,
 0.091983f, 0.750282f,
 0.091983f, 0.709862f,
 0.137216f, 0.750282f,
 0.137216f, 0.750282f,
 0.091983f, 0.709862f,
 0.137216f, 0.709862f,
 0.176724f, 0.750282f,
 0.137216f, 0.750282f,
 0.176724f, 0.709862f,
 0.176724f, 0.709862f,
 0.137216f, 0.750282f,
 0.137216f, 0.709862f,
 0.007565f, 0.750282f,
 0.007565f, 0.709862f,
 0.049236f, 0.750282f,
 0.997287f, 0.008229f,
 0.997287f, 0.089162f,
 0.134658f, 0.008229f,
 0.134658f, 0.008229f,
 0.997287f, 0.089162f,
 0.134658f, 0.089162f,};

static float[][] NormArray = new float[][]{
{ 0.953532f, 0.287838f, -0.089034f},
{ 0.844121f, -0.265813f, -0.465622f},
{ 0.908636f, 0.178460f, -0.377534f},
{ 0.873743f, -0.246241f, -0.419450f},
{ 0.369051f, 0.461918f, -0.806494f},
{ 0.531414f, 0.829480f, -0.171935f},
{ 0.498319f, 0.219884f, -0.838648f},
{ 0.546102f, -0.819250f, -0.174934f},
{ 0.500782f, -0.063642f, 0.863230f},
{ 0.395000f, -0.002180f, 0.918679f},
{ 0.172130f, -0.176243f, 0.969180f},
{ 0.211909f, 0.245881f, 0.945853f},
{ -0.029563f, 0.361543f, 0.931886f},
{ -0.012179f, -0.308180f, 0.951250f},
{ 0.002312f, 0.573210f, -0.819405f},
{ -0.024800f, 0.996588f, -0.078718f},
{ 0.018690f, 0.098424f, -0.994969f},
{ 0.427707f, 0.272713f, 0.861797f},
{ -0.778730f, 0.165249f, 0.605205f},
{ 0.414286f, -0.812741f, -0.409657f},
{ -0.183219f, -0.800819f, -0.570193f},
{ 0.016941f, -0.931093f, 0.364388f},
{ 0.356177f, 0.674590f, 0.646580f},
{ 0.479552f, 0.641652f, -0.598592f},
{ -0.029129f, 0.332849f, 0.942530f},
{ 0.033276f, -0.039825f, -0.998652f},
{ 0.768144f, -0.635964f, 0.074187f},
{ 0.664315f, 0.141222f, 0.733991f},
{ -0.594160f, -0.782488f, 0.186243f},
{ -0.579927f, 0.097641f, 0.808796f},
{ -0.000871f, -0.038985f, 0.999239f},
{ 0.732534f, -0.148802f, 0.664268f},
{ 0.653866f, -0.098599f, -0.750158f},
{ 0.004093f, 0.030987f, -0.999511f},
{ 0.843547f, 0.097593f, 0.528113f},
{ 0.836921f, 0.014093f, -0.547142f},
{ 0.020864f, 0.037590f, -0.999075f},
{ -0.019076f, 0.082453f, 0.996412f},
{ 0.949770f, 0.255295f, -0.181002f},
{ 0.636142f, 0.184488f, 0.749191f},
{ -0.234053f, 0.177264f, 0.955927f},
{ 0.257171f, 0.292010f, -0.921191f},
{ 0.662549f, 0.673750f, 0.327244f},
{ 0.741746f, 0.201771f, -0.639611f},
{ 0.014844f, -0.229957f, 0.973088f},
{ -0.180371f, -0.852882f, -0.489958f},
{ 0.834405f, 0.550312f, 0.030421f},
{ 0.720086f, -0.209102f, -0.661629f},
{ -0.621342f, -0.006608f, 0.783512f},
{ -0.669660f, -0.639167f, -0.378183f},
{ 0.731512f, 0.652605f, 0.197475f},
{ 0.806583f, -0.332254f, -0.488908f},
{ -0.798970f, 0.530095f, 0.283985f},
{ -0.797170f, -0.478180f, -0.368596f},
{ 0.462506f, 0.174134f, 0.869348f},
{ -0.450973f, 0.053649f, 0.890924f},
{ 0.946396f, 0.320616f, -0.039257f},
{ 0.374296f, 0.399914f, -0.836643f},
{ -0.962785f, 0.236911f, -0.130068f},
{ -0.899847f, 0.130400f, -0.416259f},
{ -0.808128f, -0.309723f, -0.501001f},
{ -0.840695f, -0.291803f, -0.456161f},
{ -0.566859f, 0.800294f, -0.195452f},
{ -0.358217f, 0.442591f, -0.822067f},
{ -0.472958f, 0.194071f, -0.859446f},
{ -0.493854f, -0.846887f, -0.197205f},
{ -0.264929f, 0.233209f, 0.935642f},
{ -0.433262f, -0.024191f, 0.900943f},
{ -0.203830f, -0.186235f, 0.961129f},
{ -0.533164f, -0.091120f, 0.841091f},
{ -0.478053f, 0.248642f, 0.842403f},
{ -0.352651f, -0.833122f, -0.426080f},
{ 0.742258f, 0.205669f, 0.637773f},
{ 0.249698f, -0.789313f, -0.560924f},
{ -0.591374f, 0.566057f, -0.574332f},
{ -0.475848f, 0.611950f, 0.631733f},
{ -0.013776f, -0.650315f, -0.759540f},
{ 0.647721f, -0.618297f, 0.445158f},
{ -0.861020f, -0.460845f, -0.215098f},
{ -0.295503f, -0.345701f, 0.890600f},
{ -0.708334f, -0.141411f, 0.691567f},
{ -0.709964f, -0.087136f, -0.698826f},
{ -0.865961f, 0.046877f, -0.497910f},
{ -0.852671f, 0.090648f, 0.514524f},
{ -0.696235f, 0.337062f, -0.633756f},
{ -0.871656f, 0.276800f, 0.404471f},
{ -0.413921f, 0.712559f, -0.566506f},
{ -0.781554f, 0.616765f, -0.093675f},
{ -0.463617f, -0.703276f, 0.538945f},
{ 0.929081f, -0.365121f, -0.059123f},
{ 0.160096f, 0.212682f, -0.963917f},
{ -0.658807f, 0.462107f, -0.593659f},
{ -0.352514f, -0.406987f, 0.842672f},
{ 0.892439f, -0.324315f, 0.313644f},
{ -0.872775f, 0.255720f, -0.415778f},
{ 0.133434f, -0.070085f, -0.988577f},
{ -0.130990f, 0.348527f, 0.928101f},
{ 0.902988f, -0.004896f, 0.429638f},
{ -0.977285f, 0.207466f, 0.043267f},
{ -0.506187f, 0.386691f, -0.770872f},
{ -0.995551f, -0.079732f, 0.050216f},
{ -0.997494f, -0.070523f, -0.005774f},
{ -0.992866f, -0.021207f, -0.117332f},
{ -0.989486f, -0.021933f, -0.142957f},
{ -0.994475f, -0.098109f, 0.037334f},
{ -0.994475f, -0.098109f, 0.037334f}};

static int[] FaceArray = new int[]{
14, 15, 2,
2, 15, 3,
5, 13, 106,
107, 13, 108,
109, 110, 111,
112, 113, 5,
15, 16, 3,
3, 16, 6,
0, 1, 7,
7, 1, 4,
9, 8, 4,
4, 8, 7,
5, 10, 13,
13, 10, 12,
114, 11, 5,
5, 11, 10,
12, 115, 13,
13, 116, 117,
13, 118, 119,
120, 121, 122,
123, 15, 124,
125, 15, 14,
19, 18, 21,
21, 18, 20,
126, 127, 17,
17, 128, 129,
0, 7, 19,
19, 7, 18,
130, 16, 131,
132, 16, 133,
16, 15, 134,
135, 15, 136,
137, 138, 15,
15, 139, 140,
141, 142, 143,
144, 145, 146,
17, 147, 148,
149, 150, 151,
152, 153, 154,
155, 156, 157,
46, 47, 49,
49, 47, 48,
24, 33, 23,
23, 33, 30,
22, 31, 25,
25, 31, 32,
158, 27, 31,
31, 27, 26,
32, 31, 29,
29, 31, 26,
33, 28, 30,
30, 28, 159,
160, 161, 52,
52, 162, 163,
164, 165, 51,
51, 166, 50,
167, 168, 53,
53, 169, 52,
170, 39, 171,
172, 39, 38,
173, 40, 174,
175, 40, 39,
176, 41, 177,
178, 41, 179,
180, 38, 181,
182, 38, 41,
39, 43, 38,
38, 43, 42,
40, 44, 39,
39, 44, 43,
183, 41, 184,
185, 41, 45,
38, 42, 41,
41, 42, 45,
43, 93, 42,
42, 93, 94,
43, 44, 93,
93, 44, 92,
186, 45, 187,
188, 45, 95,
42, 94, 45,
45, 94, 95,
51, 50, 35,
35, 50, 36,
189, 190, 52,
52, 191, 34,
53, 52, 37,
37, 52, 34,
54, 57, 55,
55, 57, 56,
192, 59, 193,
194, 59, 58,
195, 196, 197,
198, 199, 58,
55, 56, 61,
61, 56, 60,
65, 64, 62,
62, 64, 63,
9, 65, 8,
8, 65, 62,
58, 59, 10,
10, 59, 12,
10, 11, 58,
58, 11, 200,
201, 202, 59,
59, 203, 12,
204, 205, 206,
207, 208, 59,
54, 55, 209,
210, 55, 211,
66, 69, 67,
67, 69, 68,
212, 213, 17,
17, 214, 215,
63, 66, 62,
62, 66, 67,
216, 217, 61,
61, 218, 219,
61, 220, 55,
55, 221, 222,
223, 224, 55,
55, 225, 226,
227, 228, 229,
230, 231, 232,
233, 234, 235,
236, 237, 17,
238, 239, 240,
241, 242, 243,
72, 75, 73,
73, 75, 74,
76, 33, 70,
70, 33, 24,
25, 32, 71,
71, 32, 77,
79, 78, 77,
77, 78, 244,
32, 29, 77,
77, 29, 79,
245, 28, 76,
76, 28, 33,
246, 81, 247,
248, 81, 249,
80, 50, 250,
87, 86, 83,
83, 86, 82,
84, 88, 85,
85, 88, 89,
89, 87, 85,
85, 87, 83,
86, 87, 99,
99, 87, 98,
88, 96, 89,
89, 96, 97,
87, 89, 98,
98, 89, 97,
90, 36, 80,
80, 36, 50,
37, 91, 53,
53, 91, 81,
93, 92, 47,
47, 92, 48,
93, 47, 94,
96, 74, 97,
96, 73, 74,
104, 105, 102,
102, 105, 103,};

static int[] FaceArrayB = new int[]{
0, 1, 2,
3, 4, 5,
6, 7, 8,
9, 10, 11,
12, 13, 14,
15, 16, 17,
18, 19, 20,
21, 22, 23,
24, 25, 26,
27, 28, 29,
30, 31, 32,
33, 34, 35,
36, 37, 38,
39, 40, 41,
42, 43, 44,
45, 46, 47,
48, 49, 50,
51, 52, 53,
54, 55, 56,
57, 58, 59,
60, 61, 62,
63, 64, 65,
66, 67, 68,
69, 70, 71,
72, 73, 74,
75, 76, 77,
78, 79, 80,
81, 82, 83,
84, 85, 86,
87, 88, 89,};

static int[] textures = new int[1];
static Bitmap ModelTexture;
private static FloatBuffer mFVertexBuffer;
private static FloatBuffer mFTextureBuffer;
private static ByteBuffer  mModel;

private static FloatBuffer mFVertexBufferB;
private static FloatBuffer mFTextureBufferB;
private static ByteBuffer  mModelB;

public static void SetupBuffers(){
byte tModel[] = new byte[FaceArray.length]; 	
for (int i = 0; i < FaceArray.length; i++){
tModel[i] = (byte) (FaceArray[i]);
}
 for (int i = 0; i < TextArray.length; i+= 2){
TextArray[i+1] = TextArray[i+1] * -1;
}
byte tModelB[] = new byte[FaceArrayB.length]; 	
for (int i = 0; i < FaceArrayB.length; i++){
tModelB[i] = (byte) (FaceArrayB[i]);
}
 for (int i = 0; i < TextArrayB.length; i+= 2){
TextArrayB[i+1] = TextArrayB[i+1] * -1;
}
ByteBuffer vbb = ByteBuffer.allocateDirect(VertArray.length * 4);
vbb.order(ByteOrder.nativeOrder());
mFVertexBuffer = vbb.asFloatBuffer();
mFVertexBuffer.put(VertArray);
mFVertexBuffer.position(0);
ByteBuffer tbb = ByteBuffer.allocateDirect(TextArray.length * 4);
tbb.order(ByteOrder.nativeOrder());
mFTextureBuffer = tbb.asFloatBuffer();
mFTextureBuffer.put(TextArray);
mFTextureBuffer.position(0);
mModel = ByteBuffer.allocateDirect(FaceArray.length);
mModel.put(tModel);
mModel.position(0);
Faces = FaceArray.length;
VertArray = null;
TextArray = null;
FaceArray = null;
ByteBuffer vBbb = ByteBuffer.allocateDirect(VertArrayB.length * 4);
vBbb.order(ByteOrder.nativeOrder());
mFVertexBufferB = vBbb.asFloatBuffer();
mFVertexBufferB.put(VertArrayB);
mFVertexBufferB.position(0);
ByteBuffer tBbb = ByteBuffer.allocateDirect(TextArrayB.length * 4);
tBbb.order(ByteOrder.nativeOrder());
mFTextureBufferB = tBbb.asFloatBuffer();
mFTextureBufferB.put(TextArrayB);
mFTextureBufferB.position(0);
mModelB = ByteBuffer.allocateDirect(FaceArrayB.length);
mModelB.put(tModelB);
mModelB.position(0);
FacesB = FaceArrayB.length;
VertArrayB = null;
TextArrayB = null;
FaceArrayB = null;
}

public static void TextureSetup(GL10 gl, Bitmap Texture){
ModelTexture = Texture;
gl.glGenTextures(1, textures, 0);
gl.glBindTexture(GL10.GL_TEXTURE_2D, textures[0]);
gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MIN_FILTER, GL10.GL_NEAREST);
gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MAG_FILTER, GL10.GL_LINEAR);
GLUtils.texImage2D(GL10.GL_TEXTURE_2D, 0, ModelTexture, 0);
}

public static void draw(GL10 gl){
gl.glAlphaFunc(gl.GL_GREATER, 0.1f);
gl.glEnable(gl.GL_ALPHA_TEST);
gl.glBindTexture(GL10.GL_TEXTURE_2D, textures[0]);
gl.glVertexPointer(3, GL11.GL_FLOAT, 0, mFVertexBuffer);
gl.glTexCoordPointer(2, GL10.GL_FLOAT, 0, mFTextureBuffer);
gl.glDrawElements( gl.GL_TRIANGLES, Faces, gl.GL_UNSIGNED_BYTE, mModel);
gl.glVertexPointer(3, GL11.GL_FLOAT, 0, mFVertexBufferB);
gl.glTexCoordPointer(2, GL10.GL_FLOAT, 0, mFTextureBufferB);
gl.glDrawElements( gl.GL_TRIANGLES, FacesB, gl.GL_UNSIGNED_BYTE, mModelB);
}

}


//Vertices: 341  Texture Co-ords: 191  Normals: 106  Texture: walk Faces: 196 Smooth Groups: 2 sucess: 89 Doubles: 107 Redos needed: 145 Correct: 86