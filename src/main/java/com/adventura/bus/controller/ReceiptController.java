package com.adventura.bus.controller;
import com.adventura.bus.model.Receipt;
import com.adventura.bus.utils.QRCodeGenerator;
import com.google.zxing.WriterException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
@Controller
@RequestMapping("/receipt")
public class ReceiptController 
{
    @GetMapping("/{bookingId}")
    public String showReceipt(@PathVariable String bookingId, Model model) throws WriterException, IOException 
    {
        String qrCode = QRCodeGenerator.generateQRCodeImage("Booking ID: " + bookingId, 200, 200);
        Receipt receipt = new Receipt();
        receipt.setPassengerName("John Doe");
        receipt.setJourneyDate("2025-05-06");
        receipt.setBookingId(bookingId);
        receipt.setQrCodeData(qrCode);
        model.addAttribute("receipt", receipt);
        return "receipt"; 
    }
}
