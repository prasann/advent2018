import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class D02P2Test {
  private val classUnderTest = D02P2()

  @Test
  fun shouldConvertStringToList() {
    assertEquals(6, classUnderTest.stringToList("abcabb").size)
  }

  @Test
  fun shouldReturnTrueIfListsHasOneChange() {
    val list1 = listOf('a', 'b', 'b', 'c')
    val list2 = listOf('a', 'd', 'b', 'c')
    assertTrue(classUnderTest.hasOneDiff(list1, list2))
  }

  @Test
  fun shouldReturnFalseIfListsHasMoreChanges() {
    val list1 = listOf('a', 'e', 'e', 'c')
    val list2 = listOf('a', 'd', 'b', 'c')
    assertFalse(classUnderTest.hasOneDiff(list1, list2))
  }

  @Test
  fun shouldFindTheClosestPair() {
    val closestPair = classUnderTest.findThePair(listOf("abcde", "fghij", "klmno", "pqrst", "fguij", "axcye", "wvxyz"))
    assertEquals(listOf('f', 'g', 'h', 'i', 'j'), closestPair?.first)
    assertEquals(listOf('f', 'g', 'u', 'i', 'j'), closestPair?.second)
  }

  @Test
  fun shouldFindCommonChars() {
    val closestPair = Pair(listOf('f', 'g', 'h', 'i', 'j'), listOf('f', 'g', 'u', 'i', 'j'))
    assertEquals("fgij", classUnderTest.findCommonChars(closestPair))
  }

  @Test
  fun runIt() {
    println(classUnderTest.findTheCommmon(listOf("abcde", "fghij", "klmno", "pqrst", "fguij", "axcye", "wvxyz")))
//        println(classUnderTest.findTheCommmon(listOf("crruafyzloguvxwctqmphenbkd","srcjafyzlcguvrwctqmphenbkd","srijafyzlogbpxwctgmphenbkd","zrijafyzloguvxrctqmphendkd","srijabyzloguvowcqqmphenbkd","srijafyzsoguvxwctbmpienbkd","srirtfyzlognvxwctqmphenbkd","srijafyzloguvxwctgmphenbmq","senjafyzloguvxectqmphenbkd","srijafyeloguvxwwtqmphembkd","srijafyzlogurxtctqmpkenbkd","srijafyzlkguvxictqhphenbkd","srijafgzlogunxwctqophenbkd","shijabyzloguvxwctqmqhenbkd","srjoafyzloguvxwctqmphenbwd","srijafyhloguvxwmtqmphenkkd","srijadyzlogwvxwctqmphenbed","brijafyzloguvmwctqmphenhkd","smijafyzlhguvxwctqmphjnbkd","sriqafvzloguvxwctqmpheebkd","srijafyzloguvxwisqmpuenbkd","mrijakyuloguvxwctqmphenbkd","srnfafyzloguvxwctqmphgnbkd","srijadyzloguvxwhfqmphenbkd","srijafhzloguvxwctdmlhenbkd","srijafyzloguvxwcsqmphykbkd","srijafyzlogwvxwatqmphhnbkd","srijafyzlozqvxwctqmphenbku","srijafyzloguvxwcbamphenbgd","srijafyzlfguvxwctqmphzybkd","srijafyzloguqxwetqmphenkkd","srijafyylogubxwttqmphenbkd","srijafyzloguvxzctadphenbkd","srijafyzloguoxwhtqmchenbkd","srijafyzloguvxwcvqmzhenbko","srijnfyzloguvxwctqmchenjkd","srijaryzloggvxwctqzphenbkd","srijafhzleguvxwcxqmphenbkd","ssijafyzllguvxfctqmphenbkd","srijafyzloguvxdctqmfhenbcd","srijafyzloguvxfctqmplynbkd","srijaftzlogavxwcrqmphenbkd","sriwaoyzloguvxwctqmphenbtd","srijahyzlogunxwctqmphenbvd","srjjafyzloguzxwctumphenbkd","nrijafyzlxguvxwctqmphanbkd","srijafezlqguyxwctqmphenbkd","srijafygloguvxwjtqcphenbkd","erijafyzloguvxoctqmnhenbkd","ssijafyzllguvxwbtqmphenbkd","sriaafyzloguvxwctqqphenbkv","frijafyzloguvswctwmphenbkd","srijafyzyogkvxwctqmprenbkd","syijafyzuoguvxwctqmkhenbkd","srijafyzloganxwctqmphenbkf","srijafyzloguvxwftqmxhenbkq","srijafyflogxvxwctqmghenbkd","srijafyzsoguvxwctqmpjenwkd","srujafylloguvxwctqmphenckd","srijafyzlpzuvxwctqmphenbud","srijafyzlogfvxwctqmhhenbwd","srijafjzlogusxwctqmphepbkd","srijlfyzloguvxwctqfphenzkd","srijafyzlogwvxwctqyphenbqd","srijafyzloluvxwctqtphenukd","srizafyzlowuvxwctqmphqnbkd","sritafkzlkguvxwctqmphenbkd","sbijafdzloguvxgctqmphenbkd","crijafyeloguvxwctqmpsenbkd","srijafyvlogulxwctqmphenbkk","srijafyologuvxwctqmehegbkd","siijafyzloguvxwctjmphenbmd","srijafyzlupuvxwctqmpheabkd","srijafyzlogumxwctqqphanbkd","srijxfyzlogujxwcqqmphenbkd","irijafizeoguvxwctqmphenbkd","sgijafyzloguvtwctqmpfenbkd","srijzfyzloguvmwctnmphenbkd","srijafyzwohuvxwctqmthenbkd","srijafyzlhguvxoctqwphenbkd","srgjafyplogxvxwctqmphenbkd","srijafyqlogovxwctqzphenbkd","srijafjzloguvlnvtqmphenbkd","srijafyzooguvxwctqmphenvud","srijafyzgoguvxwctumphgnbkd","srijaffzloguvxwdqqmphenbkd","srijafyzlogugxwctqxphenbkr","srijafyzlogutxwctqmmcenbkd","srifafyzlhguwxwctqmphenbkd","mrimajyzloguvxwctqmphenbkd","sriyafyzloguvxwcthmphejbkd","srieakyzlokuvxwctqmphenbkd","srisafyzloguhxwctqmphecbkd","srijanyzloguvxcctqmxhenbkd","srijafyzypguvxwctqmqhenbkd","sryjtfyzlvguvxwctqmphenbkd","srijafyzlsguvxwctqmqfenbkd","srijafyzlogudxwbtqwphenbkd","srijysyzloguvxwctqmpvenbkd","srijafyzloggvxwjtqmphegbkd","srijgfyzloguvxwctqmbhdnbkd","ssijufyzloguvawctqmphenbkd","skojafyzloguvxwctqmphenbnd","srijafylloguvxwcqqmpienbkd","trioafyzloguvqwctqmphenbkd","srijafydloguvxwctqmpzjnbkd","saijafvzloguvxwcqqmphenbkd","srhjapyzloguvxwctqmbhenbkd","srijafyzlfguvxwcsqmpwenbkd","shijafyzboguvxwctqmphenbmd","srizafysloguvxwrtqmphenbkd","srijafyzloguvxwciqmwhenbkj","qrijafyzloduvxwctqmphenbko","srijefyuloguvxwctqmphenbed","srijafyzlobuvxwctqmphenhbd","srijafyzloxuvxwctqmpheabkq","srijafyzloguvrwctqmghenkkd","sfisafywloguvxwctqmphenbkd","srgjafyzlogurxwctqmphenbkp","srijafhzloguvxwcjqmphenhkd","srijafyylogufxwrtqmphenbkd","srijafyzvoguvxwzkqmphenbkd","sqijafyzloguvxwctqmpheqbxd","srijafyvloguvxwctqzpherbkd","srijufyzloguvxlcsqmphenbkd","srijafykloguvxlccqmphenbkd","srijafyzloguexwcrqmphenzkd","sridifyzloguyxwctqmphenbkd","srijafyzlogfvxwctqlphenbkl","srijafyzlodqdxwctqmphenbkd","srijafyzloruvxactqmphenekd","grijafyzloguvxpctmmphenbkd","srsjakyzloguvxwctqmphvnbkd","srikafyvloguvxwrtqmphenbkd","srijafyzloguvxwctqjpserbkd","jrijafyzloguvxwctqmpgesbkd","swijafyzluguvxwctqmfhenbkd","srijanynlogovxwctqmphenbkd","jrijafyzloguvxwctymphrnbkd","srinafyzloguvewctqmphenbzd","srijakyzloguvxwctqmphcnbka","srijafyhlobuvxwctqmphenbka","srijafyzcogusxwctqmphwnbkd","srijavyzlosuvxwctqmphjnbkd","orijafyzxoguvxwcnqmphenbkd","srijafyzlogcvxwvtqmthenbkd","srijapyzloauvxwctqmphenvkd","srijaflzloguhxwctqmphenbwd","smijafyzlonuvxwctqmphenbkw","jrijafyzloguvxwclqmnhenbkd","srijaqyzloguvqwctqmphenskd","srijasyzloguvxwctqmvhenbku","crijtfyzloguvxwctqmthenbkd","srrkafyzvoguvxwctqmphenbkd","srijatyzloguvewctqmphenbld","srfjafyyloguvnwctqmphenbkd","srijafyzloguvxwctqjpbenbkt","hrijafyzooguvxwctqmphenbld","srijafbzlogscxwctqmphenbkd","srinafyzlogxvxwctqqphenbkd","slijafyzloglvxwctqmphenbdd","srijafyzlogjvxwcsqmphenbld","sryjcfyzloguvewctqmphenbkd","srijafyzloguexwctqmohknbkd","jaijafyzlogevxwctqmphenbkd","srijafbzlogavxwctqmphenbki","srijafozlogpvxwctqmphgnbkd","srijdfyzloguvxwczqmphenbkm","srijafyzlobuvxwctqmphxndkd","mrijifyzlhguvxwctqmphenbkd","srijafyzloguvxbctumphjnbkd","srijafyzloyuvxwptqmphlnbkd","arijafyzloguvxwcsqmohenbkd","srijaftzioguvxwttqmphenbkd","srijafyzlqsuvxwctqmphxnbkd","srijafyzioguvxwctqnphetbkd","prijafbzloguvxdctqmphenbkd","srijaeyzlnguvxwmtqmphenbkd","srijofyzloguvqwctqmphonbkd","srixaryzpoguvxwctqmphenbkd","srijafyzlowuvxwcwhmphenbkd","srijafydloguvxwctqmptenikd","srijqfyzlogtvfwctqmphenbkd","srijafyzloguvxlctqmpvenbgd","srijafyzlbguvxwjtqgphenbkd","srijafyzlohuqxwctqmphenbka","srijafyzroguvxictqmphynbkd","srijafyzloguvxdctjmphenjkd","srijaoczloguvxwctqmphenbjd","srajafhzloguvxwctqmphenbke","srijofyzloduvxwctqmphanbkd","srijafytloguvxwmtnmphenbkd","srijafyzuoguvxwceqmpgenbkd","rrijafyzloyuvxwctqmphlnbkd","srljafyzloguvxictqmohenbkd","srijafyzlogulxwcrqrphenbkd","srajafyzloguvxwctqmphanbke","srijafyzlhguvxwxtqmpheabkd","sxijafyzloggwxwctqmphenbkd","srijafyultguvxwctqmphinbkd","srijafyzloguvtwctqmfhvnbkd","srijafwzloruvxwctquphenbkd","srbjafyzxoguuxwctqmphenbkd","erijafyzlxguvxbctqmphenbkd","srijagyzlojubxwctqmphenbkd","srijafyzloguvxwdtqmchenakd","srijafkzlogukxwctqiphenbkd","mridafyzloguvxwctqmphenrkd","szqjafyzloguvxwctqmpheibkd","srijahyzloguvxwctcmphenekd","srijafyzloguvxwczpuphenbkd","srijafyzcoguvfwctqmphenbkq","qriiafyzloguvxwctqmpheebkd","srijpfyzloguvxlctqmphenokd","srijzfyzlotuvxwcjqmphenbkd","srinafyqloguvxwctfmphenbkd","srijafyzlogjvxpltqmphenbkd","srijafyzlotuvxwutqmphenbtd","sridafyzloguvxwctqmpyenokd","srxjafyzqogyvxwctqmphenbkd","ssijafyzzoguvxwctqmphenbad","srijafrzloguvxwctqmphekpkd","srijafyzlfgrvxactqmphenbkd","srijafyzroguvxwttqmphekbkd","srijefyzloguvxwctqmpqenbrd","srijefycloguvxwctqmchenbkd","srzjafyzloguvxwcqqmphanbkd","srijauyzlhguvxwctqmphenbgd","srijafyzloguvmwvnqmphenbkd","srihafyzloguvlwotqmphenbkd","srigafyzloguvxwctqmphennsd","sriuafzzloguvxwcuqmphenbkd","srijavuzllguvxwctqmphenbkd","srijafjzloguvlnctqmphenbkd","lrirafyzloguvxwctqmphenbld","soijarxzloguvxwctqmphenbkd","srijapyzlnguvxwctqmdhenbkd","srijafyzkogujxmctqmphenbkd","srijafuzloguvxwcsqvphenbkd","srijagyzzoguvxwctqmpvenbkd","srijafyzlovuvxwctqmrhenbxd","srijafyzqoguvxwctwmpienbkd","sxijafyzloguvxwutqmphenlkd","srijafyzlhgzvxwctqmphqnbkd","srijajyzloguvxwcbwmphenbkd","srijazyzloguvxwhtqmphenbkx","srgjafyzloguvvwctqmphdnbkd","rrivafyzloguvxjctqmphenbkd","srijifyzdoguvxwctqmphenbka","hrijafyzloguvxectqmpheybkd")))

  }
}
