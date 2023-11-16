package id.infinitelearning.KotlinSubmission.exercise1

/**
 * Latihan 1
 * Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
 * - Variable bertipe data string yang menyimpan nilai nama depan Anda.
 * - Variable bertipe data string yang menyimpan nilai nama belakang Anda.
 * - Variable bertipe data number yang menyimpan nilai umur Anda.
 * - Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
 * Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Vera"
    val lastName: String = "Romandhon"
    val age: Int = 21
    val isSingle: Boolean = true

    println("Nama: $firstName $lastName")
    println("Umur: $age tahun")
    println("Status: ${if (isSingle) "Punya Pacar" else "Not Single"}")
}


/**
 * Latihan 2
 * Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")


    return "Group details printed successfully."
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMembers = listOf("Project Nusantara")
    println("List of Group Members: $groupMembers")

    return groupMembers
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 * total mentor + jumlah anggota group
 */
fun totalMember(): Int {
    val mentors = arrayOf("Reynaldi", "Malik")
    val countOfGroup = 11

    return mentors.size + countOfGroup
}

fun main() {
    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     * Latihan 5
     * Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     */
    groupDetail("11", listOf("Vera Romandhon", "Thoriq Ambia", "Wiriawan Nasution", "Hana Mardini", "Meylia Herde", "Adryan Eka", "Amalia", "Fajri Maulana", "Rifka Khairuna", "Jero Galih", "Safira Asari"), "Morning Session")
}