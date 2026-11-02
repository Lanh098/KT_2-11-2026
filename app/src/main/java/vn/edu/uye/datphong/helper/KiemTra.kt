package vn.edu.uye.datphong.helper
object KiemTraHelper {
    fun ktHoTen(hoTen: String): Boolean {
        val regex = Regex("^[a-zA-ZÀ-ỹ\\s]+$")
        return regex.matches(hoTen)
    }
    fun ktSdt(sdt: String): Boolean {
        val regex = Regex("^0\\d{9}\$")
        return regex.matches(sdt)
    }
    
}