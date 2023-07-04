package com.example.Tuan3;

import com.example.Tuan3.Model.KhoaHoc;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/khoahoc")
public class KhoaHocController {
    @GetMapping("/{id}")
    public KhoaHoc getKhoaHoc(@PathVariable String id) {
        // Xử lý logic để trả về đối tượng KhoaHoc với id tương ứng
        // Ví dụ:
        KhoaHoc khoaHoc = new KhoaHoc("KH01","Lập trình React Native", "Khóa học chuyên sâu về React Native", 100000.0, 80000.0, null, "Huỳnh Hữu Phước");
        return khoaHoc;
    }

    @PostMapping("/")
    public KhoaHoc createKhoaHoc(@RequestBody KhoaHoc khoaHoc) {
        // Xử lý logic để tạo mới đối tượng KhoaHoc từ dữ liệu nhận được
        // Ví dụ:
        System.out.println(khoaHoc);
        return khoaHoc;
    }
}
