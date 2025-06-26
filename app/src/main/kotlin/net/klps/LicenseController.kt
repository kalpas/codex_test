package net.klps

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/licenses")
class LicenseController(private val repository: LicenseRepository) {

    @GetMapping
    fun all(): List<License> = repository.findAll()

    @PostMapping
    fun create(@RequestBody license: License): License = repository.save(license)
}
