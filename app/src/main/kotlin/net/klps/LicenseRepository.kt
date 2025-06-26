package net.klps

import org.springframework.data.jpa.repository.JpaRepository

interface LicenseRepository : JpaRepository<License, Long>
