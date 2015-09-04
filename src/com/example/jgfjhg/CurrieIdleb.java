package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class CurrieIdleb {

static String TextureName = "CurrieIdile2.mtl";

static int Vertices = 176;

static int VertTexts = 138;

static int Normals = 108;

static int Faces = 164;

static int FacesB = 0;

static int SmoothGroups = 11;

static float VertArray[] = new float[]{
 1.934174f, 3.541697f, 3.983013f,
 2.663022f, 1.350000f, 2.046106f,
 1.548137f, 4.381205f, 2.859806f,
 2.278117f, 2.192520f, 0.920405f,
 0.678207f, 4.876549f, 1.822784f,
 0.976011f, 5.420862f, 0.015512f,
 -1.322719f, 4.612165f, 1.472692f,
 -1.013017f, 5.577127f, -0.118436f,
 -0.277702f, 4.748381f, 1.476612f,
 0.496865f, 4.908751f, 0.823172f,
 -0.070880f, 5.002665f, 0.221340f,
 -0.206030f, 5.583652f, 2.045151f,
 0.862529f, 5.791084f, 0.987789f,
 -0.215650f, 6.129875f, -0.114393f,
 -0.175383f, 6.698405f, 1.996133f,
 0.678602f, 6.702967f, 1.132409f,
 -0.204306f, 7.035487f, 0.242502f,
 -0.195934f, 6.729731f, 0.923184f,
 0.240766f, 6.556220f, 0.587714f,
 -0.208653f, 6.272855f, 0.259151f,
 -0.200774f, 7.410374f, 0.670500f,
 0.416760f, 7.008983f, 0.183515f,
 -0.202773f, 6.608869f, -0.278088f,
 -0.206416f, 7.656816f, 0.187931f,
 0.232432f, 7.344700f, -0.095464f,
 -0.204217f, 7.089005f, -0.482849f,
 -0.091690f, 2.524869f, 0.850989f,
 0.450377f, 2.020369f, -0.305483f,
 -1.222506f, 0.000162f, 1.332227f,
 1.067576f, 0.000184f, -0.957811f,
 -0.397844f, 3.895943f, 1.499125f,
 0.212748f, 5.222287f, -0.179900f,
 -0.271336f, 4.919126f, 1.423251f,
 -0.078373f, 5.375183f, 0.227727f,
 0.399531f, 5.173380f, 0.922081f,
 0.093426f, 5.070999f, 1.179966f,
 0.257949f, 5.303916f, 0.518930f,
 0.540237f, 2.395026f, 1.099309f,
 0.973667f, 2.194298f, 0.751740f,
 1.486753f, 0.000163f, 1.332478f,
 0.132163f, -0.000188f, 1.960322f,
 0.838780f, 2.023250f, 0.134168f,
 1.695544f, -0.000190f, 0.397004f,
 0.494496f, 4.113893f, 1.587664f,
 1.266441f, 4.857953f, 1.110857f,
 1.127649f, 5.121317f, 0.412695f,
 1.748305f, 2.563764f, 2.394853f,
 1.514357f, 3.385438f, 1.354503f,
 1.405544f, 3.630999f, 1.678522f,
 1.639289f, 2.809468f, 2.718424f,
 0.835943f, 4.408637f, 0.442642f,
 0.702992f, 4.268476f, 0.808414f,
 1.682075f, 3.782118f, 1.909326f,
 2.033164f, 2.787712f, 3.216190f,
 0.524405f, 4.697969f, 1.162188f,
 1.959137f, 3.844937f, 1.672516f,
 2.543108f, 3.012469f, 2.858040f,
 1.411852f, 4.859890f, 1.093707f,
 2.066382f, 3.599240f, 1.353013f,
 2.652140f, 2.766769f, 2.534413f,
 1.553087f, 4.755699f, 0.677227f,
 1.902937f, 3.281989f, 1.251507f,
 2.255747f, 2.286025f, 2.555522f,
 0.780241f, 5.145852f, 0.458970f,
 -0.548357f, 2.540534f, 0.230763f,
 -1.850552f, -0.000161f, -0.022533f,
 -1.222759f, 0.000163f, -1.377033f,
 -0.523857f, 2.436807f, -0.522464f,
 -0.287187f, -0.000164f, -1.585894f,
 -0.043446f, 2.180900f, -0.561241f,
 -1.423952f, 4.858481f, 0.132371f,
 -1.215607f, 4.113192f, 0.963669f,
 -0.873172f, 5.151346f, -0.304627f,
 -0.755844f, 5.147610f, 0.777468f,
 -0.549279f, 5.063761f, 1.066193f,
 -0.380539f, 5.308762f, 0.380340f,
 -2.014123f, 3.314749f, -1.105660f,
 -2.046227f, 3.371990f, -0.689784f,
 -1.365213f, 4.332276f, -1.042126f,
 -1.280298f, 4.387373f, -1.457507f,
 -0.798482f, 4.269706f, 0.252698f,
 -0.662876f, 4.412375f, -0.109455f,
 -2.622595f, 3.261090f, -0.446596f,
 -1.731201f, 4.369185f, -0.956985f,
 -0.890053f, 4.692171f, 0.649378f,
 -2.899354f, 3.738818f, -0.812943f,
 -1.854145f, 4.654685f, -1.087402f,
 -1.573084f, 4.803212f, 0.181434f,
 -2.867991f, 3.682127f, -1.227858f,
 -1.756033f, 4.725162f, -1.556907f,
 -1.420750f, 5.215728f, 0.088136f,
 -2.558303f, 3.145315f, -1.295209f,
 -1.587225f, 4.442369f, -1.732488f,
 -0.632806f, 5.146464f, -0.055045f,
 -0.803093f, 4.859970f, 0.668041f,
 -1.251883f, 5.786622f, 1.024263f,
 -1.062225f, 6.702541f, 1.165914f,
 -0.644821f, 6.555925f, 0.605977f,
 -0.833095f, 7.009355f, 0.212375f,
 -0.655350f, 7.346644f, -0.071795f,
 -1.631111f, 1.590136f, 0.196669f,
 -1.434335f, 1.249548f, 1.250941f,
 -0.565304f, 1.164411f, 1.963632f,
 0.517182f, 1.112965f, 1.675799f,
 0.505819f, 0.887212f, 0.834838f,
 -0.017053f, 0.881849f, -0.078322f,
 -0.801925f, 1.179594f, -0.660485f,
 -1.376790f, 1.526311f, -0.611648f,
 1.748305f, 2.563764f, 2.394853f,
 1.748305f, 2.563764f, 2.394853f,
 1.514357f, 3.385438f, 1.354503f,
 1.514357f, 3.385438f, 1.354503f,
 0.835943f, 4.408637f, 0.442642f,
 0.835943f, 4.408637f, 0.442642f,
 2.255747f, 2.286025f, 2.555522f,
 2.255747f, 2.286025f, 2.555522f,
 -0.017053f, 0.881849f, -0.078322f,
 -0.017053f, 0.881849f, -0.078322f,
 0.450377f, 2.020369f, -0.305483f,
 -1.434335f, 1.249548f, 1.250941f,
 -1.434335f, 1.249548f, 1.250941f,
 -0.091690f, 2.524869f, 0.850989f,
 -0.091690f, 2.524869f, 0.850989f,
 -0.397844f, 3.895943f, 1.499125f,
 -0.397844f, 3.895943f, 1.499125f,
 0.450377f, 2.020369f, -0.305483f,
 0.212748f, 5.222287f, -0.179900f,
 0.212748f, 5.222287f, -0.179900f,
 -0.397844f, 3.895943f, 1.499125f,
 -0.271336f, 4.919126f, 1.423251f,
 -0.271336f, 4.919126f, 1.423251f,
 0.212748f, 5.222287f, -0.179900f,
 0.212748f, 5.222287f, -0.179900f,
 -0.078373f, 5.375183f, 0.227727f,
 -2.014123f, 3.314749f, -1.105660f,
 -2.014123f, 3.314749f, -1.105660f,
 -1.280298f, 4.387373f, -1.457507f,
 -0.662876f, 4.412375f, -0.109455f,
 -0.662876f, 4.412375f, -0.109455f,
 -1.280298f, 4.387373f, -1.457507f,
 -2.558303f, 3.145315f, -1.295209f,
 -2.558303f, 3.145315f, -1.295209f,
 -0.206030f, 5.583652f, 2.045151f,
 -0.277702f, 4.748381f, 1.476612f,
 -0.277702f, 4.748381f, 1.476612f,
 -0.215650f, 6.129875f, -0.114393f,
 -0.070880f, 5.002665f, 0.221340f,
 -0.070880f, 5.002665f, 0.221340f,
 -0.175383f, 6.698405f, 1.996133f,
 -0.206030f, 5.583652f, 2.045151f,
 -0.206030f, 5.583652f, 2.045151f,
 -0.215650f, 6.129875f, -0.114393f,
 -0.215650f, 6.129875f, -0.114393f,
 -0.204306f, 7.035487f, 0.242502f,
 -0.204306f, 7.035487f, 0.242502f,
 -0.175383f, 6.698405f, 1.996133f,
 -0.200774f, 7.410374f, 0.670500f,
 -0.200774f, 7.410374f, 0.670500f,
 -0.195934f, 6.729731f, 0.923184f,
 -0.202773f, 6.608869f, -0.278088f,
 -0.208653f, 6.272855f, 0.259151f,
 -0.208653f, 6.272855f, 0.259151f,
 -0.206416f, 7.656816f, 0.187931f,
 -0.200774f, 7.410374f, 0.670500f,
 -0.200774f, 7.410374f, 0.670500f,
 -0.204217f, 7.089005f, -0.482849f,
 -0.202773f, 6.608869f, -0.278088f,
 -0.202773f, 6.608869f, -0.278088f,
 -0.204217f, 7.089005f, -0.482849f,
 -0.206416f, 7.656816f, 0.187931f,
 -1.434335f, 1.249548f, 1.250941f,
 -1.222506f, 0.000162f, 1.332227f,
 -1.222506f, 0.000162f, 1.332227f,
 1.067576f, 0.000184f, -0.957811f,
 1.067576f, 0.000184f, -0.957811f,
 -0.017053f, 0.881849f, -0.078322f,};

static float VertArrayB[] = new float[]{};

static float[] TextArray = new float[]{
 0.375318f, 0.765676f,
 0.726555f, 0.762717f,
 0.377036f, 0.969692f,
 0.728274f, 0.966733f,
 0.751372f, 0.748217f,
 0.983685f, 0.748217f,
 0.751372f, 0.980530f,
 0.983685f, 0.980530f,
 0.058710f, 0.738044f,
 0.188314f, 0.734887f,
 0.298759f, 0.731781f,
 0.012084f, 0.850170f,
 0.178645f, 0.832921f,
 0.349294f, 0.881601f,
 0.055351f, 0.984595f,
 0.176141f, 0.925991f,
 0.293720f, 0.997210f,
 0.872342f, 0.403154f,
 0.924498f, 0.397358f,
 0.984533f, 0.402409f,
 0.860112f, 0.467764f,
 0.930985f, 0.444975f,
 0.995345f, 0.462955f,
 0.884231f, 0.506639f,
 0.927176f, 0.482453f,
 0.975989f, 0.504915f,
 0.559083f, 0.419261f,
 0.854419f, 0.422899f,
 0.437548f, 0.046585f,
 0.993325f, 0.069860f,
 0.542471f, 0.638121f,
 0.858956f, 0.685943f,
 0.609025f, 0.737908f,
 0.820745f, 0.740206f,
 0.726012f, 0.731222f,
 0.663006f, 0.736147f,
 0.774517f, 0.737078f,
 0.640628f, 0.408432f,
 0.731389f, 0.404769f,
 0.747247f, 0.006134f,
 0.590414f, 0.010997f,
 0.792625f, 0.411168f,
 0.845019f, 0.023161f,
 0.623727f, 0.626072f,
 0.715423f, 0.645094f,
 0.772830f, 0.657102f,
 0.060226f, 0.152330f,
 0.062324f, 0.359205f,
 0.128458f, 0.361265f,
 0.122794f, 0.145753f,
 0.057239f, 0.548531f,
 0.120907f, 0.563080f,
 0.184346f, 0.334298f,
 0.174400f, 0.059940f,
 0.194282f, 0.653636f,
 0.244613f, 0.345557f,
 0.234830f, 0.122695f,
 0.244885f, 0.547684f,
 0.315355f, 0.343710f,
 0.291114f, 0.133239f,
 0.302843f, 0.546952f,
 0.375118f, 0.328689f,
 0.347131f, 0.062291f,
 0.362179f, 0.641571f,
 0.640628f, 0.408432f,
 0.590414f, 0.010997f,
 0.747247f, 0.006134f,
 0.731389f, 0.404769f,
 0.845019f, 0.023161f,
 0.792625f, 0.411168f,
 0.715423f, 0.645094f,
 0.623727f, 0.626072f,
 0.772830f, 0.657102f,
 0.726012f, 0.731222f,
 0.663006f, 0.736147f,
 0.774517f, 0.737078f,
 0.060226f, 0.152330f,
 0.122794f, 0.145753f,
 0.128458f, 0.361265f,
 0.062324f, 0.359205f,
 0.120907f, 0.563080f,
 0.057239f, 0.548531f,
 0.174400f, 0.059940f,
 0.184346f, 0.334298f,
 0.194282f, 0.653636f,
 0.234830f, 0.122695f,
 0.244613f, 0.345557f,
 0.244885f, 0.547684f,
 0.291114f, 0.133239f,
 0.315355f, 0.343710f,
 0.302843f, 0.546952f,
 0.347131f, 0.062291f,
 0.375118f, 0.328689f,
 0.362179f, 0.641571f,
 0.188314f, 0.734887f,
 0.178645f, 0.832921f,
 0.176141f, 0.925991f,
 0.924498f, 0.397358f,
 0.930985f, 0.444975f,
 0.927176f, 0.482453f,
 0.615686f, 0.211026f,
 0.498717f, 0.234153f,
 0.615686f, 0.211026f,
 0.739266f, 0.206767f,
 0.818649f, 0.218445f,
 0.923414f, 0.247544f,
 0.818649f, 0.218445f,
 0.739266f, 0.206767f,
 0.422822f, 0.123268f,
 0.422822f, 0.123268f,
 0.430455f, 0.354593f,
 0.430455f, 0.354593f,
 0.448956f, 0.557990f,
 0.448956f, 0.557990f,
 0.033925f, 0.060990f,
 0.033925f, 0.060990f,
 0.923414f, 0.247544f,
 0.923414f, 0.247544f,
 0.854419f, 0.422899f,
 0.498717f, 0.234153f,
 0.498717f, 0.234153f,
 0.559083f, 0.419261f,
 0.559083f, 0.419261f,
 0.542471f, 0.638121f,
 0.542471f, 0.638121f,
 0.854419f, 0.422899f,
 0.858956f, 0.685943f,
 0.858956f, 0.685943f,
 0.542471f, 0.638121f,
 0.609025f, 0.737908f,
 0.609025f, 0.737908f,
 0.858956f, 0.685943f,
 0.858956f, 0.685943f,
 0.820745f, 0.740206f,
 0.422822f, 0.123268f,
 0.422822f, 0.123268f,
 0.430455f, 0.354593f,
 0.448956f, 0.557990f,
 0.448956f, 0.557990f,
 0.430455f, 0.354593f,
 0.033925f, 0.060990f,
 0.033925f, 0.060990f,
 0.012084f, 0.850170f,
 0.058710f, 0.738044f,
 0.058710f, 0.738044f,
 0.349294f, 0.881601f,
 0.298759f, 0.731781f,
 0.298759f, 0.731781f,
 0.055351f, 0.984595f,
 0.012084f, 0.850170f,
 0.012084f, 0.850170f,
 0.349294f, 0.881601f,
 0.349294f, 0.881601f,
 0.293720f, 0.997210f,
 0.293720f, 0.997210f,
 0.055351f, 0.984595f,
 0.860112f, 0.467764f,
 0.860112f, 0.467764f,
 0.872342f, 0.403154f,
 0.995345f, 0.462955f,
 0.984533f, 0.402409f,
 0.984533f, 0.402409f,
 0.884231f, 0.506639f,
 0.860112f, 0.467764f,
 0.860112f, 0.467764f,
 0.975989f, 0.504915f,
 0.995345f, 0.462955f,
 0.995345f, 0.462955f,
 0.975989f, 0.504915f,
 0.884231f, 0.506639f,
 0.498717f, 0.234153f,
 0.437548f, 0.046585f,
 0.437548f, 0.046585f,
 0.993325f, 0.069860f,
 0.993325f, 0.069860f,
 0.923414f, 0.247544f,};

static float[] TextArrayB = new float[]{};

static float[][] NormArray = new float[][]{
{ 0.932460f, 0.357302f, -0.053424f},
{ 0.932626f, 0.357044f, -0.052235f},
{ 0.932527f, 0.357199f, -0.052948f},
{ 0.932692f, 0.356941f, -0.051761f},
{ -0.170820f, 0.950861f, 0.258232f},
{ -0.078036f, 0.918843f, 0.386830f},
{ -0.069821f, 0.914898f, 0.397601f},
{ 0.031719f, 0.851865f, 0.522800f},
{ -0.262701f, 0.338247f, 0.903647f},
{ 0.574432f, 0.235322f, 0.783997f},
{ 0.166702f, 0.141971f, 0.975733f},
{ 0.977248f, -0.129372f, 0.168076f},
{ 0.846450f, 0.450427f, -0.283968f},
{ 0.858343f, -0.136770f, -0.494512f},
{ 0.624075f, -0.064443f, -0.778702f},
{ 0.692533f, 0.507120f, -0.513058f},
{ -0.780489f, 0.341332f, 0.523765f},
{ -0.579964f, 0.123612f, 0.805209f},
{ 0.912892f, 0.125855f, 0.388316f},
{ 0.359733f, -0.086029f, 0.929081f},
{ -0.384829f, -0.266588f, 0.883650f},
{ 0.344452f, 0.209533f, -0.915122f},
{ 0.760515f, 0.163247f, -0.628464f},
{ 0.197624f, 0.738375f, 0.644784f},
{ 0.398799f, 0.495745f, 0.771490f},
{ -0.260303f, 0.277050f, 0.924925f},
{ -0.008852f, 0.934171f, -0.356717f},
{ 0.218536f, 0.975661f, -0.018092f},
{ -0.887908f, -0.030007f, 0.459042f},
{ -0.939085f, -0.132327f, 0.317189f},
{ -0.604388f, -0.743021f, -0.287463f},
{ -0.674603f, -0.667701f, -0.314779f},
{ 0.519630f, -0.137285f, -0.843290f},
{ -0.618892f, -0.781060f, 0.083173f},
{ -0.121629f, 0.253785f, 0.959583f},
{ -0.210129f, 0.646440f, 0.733458f},
{ -0.353398f, 0.365221f, 0.861234f},
{ 0.574944f, 0.580061f, 0.577035f},
{ 0.735980f, 0.632003f, 0.242704f},
{ 0.209782f, 0.821093f, 0.530846f},
{ 0.928480f, -0.208259f, -0.307496f},
{ 0.905758f, 0.142149f, -0.399244f},
{ 0.472653f, 0.164929f, -0.865677f},
{ 0.322508f, -0.910362f, -0.259287f},
{ 0.284144f, -0.572441f, -0.769138f},
{ 0.656945f, 0.670683f, -0.344394f},
{ 0.029102f, -0.275061f, 0.960986f},
{ -0.085266f, -0.593121f, 0.800585f},
{ 0.997213f, -0.074440f, -0.004949f},
{ 0.915199f, -0.394578f, 0.081968f},
{ -0.056832f, 0.028687f, -0.997972f},
{ 0.043212f, -0.231760f, -0.971813f},
{ 0.023732f, 0.589808f, 0.807195f},
{ 0.792566f, 0.597818f, 0.120220f},
{ -0.008903f, 0.845539f, -0.533839f},
{ 0.018864f, 0.348091f, 0.937271f},
{ 0.942772f, -0.123488f, 0.309730f},
{ 0.017158f, 0.633465f, 0.773581f},
{ 0.999414f, 0.029439f, 0.017442f},
{ -0.023338f, -0.847472f, -0.530327f},
{ -0.011643f, -0.685726f, -0.727766f},
{ 0.002508f, 0.999487f, -0.031920f},
{ 0.730135f, 0.524657f, -0.437765f},
{ -0.023024f, 0.130289f, -0.991209f},
{ -0.604091f, 0.117998f, -0.788131f},
{ -0.687728f, 0.407547f, -0.600779f},
{ -0.932428f, 0.177295f, 0.314873f},
{ -0.911173f, 0.409077f, 0.049191f},
{ 0.298824f, -0.002214f, -0.954306f},
{ 0.384442f, 0.462657f, -0.798844f},
{ -0.895906f, -0.282134f, 0.343151f},
{ -0.947361f, 0.056429f, -0.315157f},
{ -0.222148f, 0.271662f, -0.936403f},
{ -0.643395f, 0.643532f, 0.414620f},
{ -0.660190f, 0.393795f, 0.639589f},
{ -0.195827f, 0.975274f, -0.102430f},
{ 0.853224f, -0.245369f, -0.460220f},
{ 0.424831f, -0.892769f, 0.149943f},
{ 0.600572f, -0.703984f, -0.379104f},
{ 0.579284f, -0.440813f, 0.685649f},
{ 0.829774f, -0.302649f, -0.468912f},
{ -0.530430f, -0.759621f, 0.376324f},
{ -0.348244f, -0.215934f, 0.912194f},
{ -0.307211f, -0.206919f, 0.928873f},
{ -0.530243f, -0.226188f, 0.817118f},
{ -0.713686f, 0.453839f, 0.533557f},
{ -0.782855f, 0.598959f, 0.168484f},
{ -0.757161f, -0.401269f, 0.515452f},
{ -0.694554f, 0.188372f, -0.694342f},
{ -0.149453f, 0.813047f, -0.562689f},
{ -0.226930f, 0.973495f, -0.028454f},
{ 0.293562f, 0.209376f, -0.932729f},
{ -0.234459f, -0.606559f, -0.759681f},
{ 0.483703f, 0.796853f, -0.362018f},
{ -0.994132f, -0.106290f, -0.020081f},
{ -0.897697f, -0.317209f, -0.305808f},
{ -0.784057f, 0.605327f, 0.137237f},
{ -0.999024f, 0.025623f, 0.035980f},
{ -0.931493f, -0.122926f, 0.342361f},
{ -0.742468f, 0.515129f, -0.428233f},
{ -0.989218f, 0.141635f, -0.037258f},
{ -0.768690f, -0.084286f, 0.634044f},
{ 0.141016f, 0.081650f, 0.986635f},
{ 0.714138f, 0.518915f, 0.469824f},
{ 0.585840f, 0.794703f, -0.158865f},
{ 0.448987f, 0.795301f, -0.407317f},
{ 0.182581f, 0.623910f, -0.759869f},
{ -0.575502f, 0.340796f, -0.743408f}};

static int[] FaceArray = new int[]{
0, 1, 2,
2, 1, 3,
4, 5, 6,
6, 5, 7,
102, 103, 37,
37, 103, 38,
103, 104, 38,
38, 104, 41,
27, 41, 105,
105, 41, 104,
102, 37, 101,
101, 37, 26,
44, 43, 38,
38, 43, 37,
43, 30, 37,
37, 30, 26,
27, 31, 41,
41, 31, 45,
41, 45, 38,
38, 45, 44,
44, 34, 43,
43, 34, 35,
35, 32, 43,
43, 32, 30,
33, 36, 31,
31, 36, 45,
36, 34, 45,
45, 34, 44,
49, 48, 46,
46, 48, 47,
47, 48, 50,
50, 48, 51,
53, 52, 49,
49, 52, 48,
48, 52, 51,
51, 52, 54,
53, 56, 52,
52, 56, 55,
55, 57, 52,
52, 57, 54,
56, 59, 55,
55, 59, 58,
58, 60, 55,
55, 60, 57,
62, 61, 59,
59, 61, 58,
58, 61, 60,
60, 61, 63,
62, 108, 61,
61, 109, 110,
111, 112, 61,
61, 113, 63,
63, 54, 60,
60, 54, 57,
59, 56, 62,
62, 56, 53,
53, 49, 114,
115, 49, 46,
11, 8, 12,
12, 8, 9,
13, 12, 10,
10, 12, 9,
14, 11, 15,
15, 11, 12,
12, 13, 15,
15, 13, 16,
16, 14, 15,
17, 18, 20,
20, 18, 21,
18, 19, 21,
21, 19, 22,
23, 20, 24,
24, 20, 21,
21, 22, 24,
24, 22, 25,
25, 23, 24,
67, 107, 64,
64, 107, 100,
69, 106, 67,
67, 106, 107,
106, 69, 116,
117, 69, 118,
100, 119, 64,
64, 120, 121,
64, 71, 67,
67, 71, 70,
122, 123, 64,
64, 124, 71,
125, 69, 126,
127, 69, 72,
69, 67, 72,
72, 67, 70,
70, 71, 73,
73, 71, 74,
128, 129, 71,
71, 130, 74,
72, 75, 131,
132, 75, 133,
70, 73, 72,
72, 73, 75,
79, 78, 76,
76, 78, 77,
79, 81, 78,
78, 81, 80,
78, 83, 77,
77, 83, 82,
78, 80, 83,
83, 80, 84,
82, 83, 85,
85, 83, 86,
84, 87, 83,
83, 87, 86,
85, 86, 88,
88, 86, 89,
87, 90, 86,
86, 90, 89,
89, 92, 88,
88, 92, 91,
89, 90, 92,
92, 90, 93,
91, 92, 134,
135, 92, 136,
93, 137, 92,
92, 138, 139,
93, 90, 84,
84, 90, 87,
88, 91, 85,
85, 91, 82,
76, 77, 140,
141, 77, 82,
142, 95, 143,
144, 95, 94,
145, 146, 95,
95, 147, 94,
148, 96, 149,
150, 96, 95,
95, 96, 151,
152, 96, 153,
154, 96, 155,
98, 97, 156,
157, 97, 158,
159, 160, 98,
98, 161, 97,
162, 99, 163,
164, 99, 98,
165, 166, 99,
99, 167, 98,
168, 99, 169,
65, 28, 100,
100, 28, 170,
40, 102, 171,
172, 102, 101,
103, 102, 39,
39, 102, 40,
104, 103, 42,
42, 103, 39,
105, 104, 29,
29, 104, 42,
68, 106, 173,
174, 106, 175,
106, 68, 107,
107, 68, 66,
107, 66, 100,
100, 66, 65, };

static int[] FaceArrayB = new int[]{};

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


//Vertices: 176  Texture Co-ords: 138  Normals: 108  Texture: CurrieIdile2.mtl Faces: 164 Smooth Groups: 11 sucess: 117 Doubles: 47 Redos needed: 68 Correct: 73