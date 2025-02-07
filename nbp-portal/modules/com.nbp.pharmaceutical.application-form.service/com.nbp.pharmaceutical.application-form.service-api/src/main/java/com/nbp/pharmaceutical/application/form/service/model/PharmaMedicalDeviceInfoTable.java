/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_pharma_medical_device&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaMedicalDeviceInfo
 * @generated
 */
public class PharmaMedicalDeviceInfoTable
	extends BaseTable<PharmaMedicalDeviceInfoTable> {

	public static final PharmaMedicalDeviceInfoTable INSTANCE =
		new PharmaMedicalDeviceInfoTable();

	public final Column<PharmaMedicalDeviceInfoTable, Long>
		pharmaMedicalDeviceId = createColumn(
			"pharmaMedicalDeviceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PharmaMedicalDeviceInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaMedicalDeviceInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaMedicalDeviceInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaMedicalDeviceInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaMedicalDeviceInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaMedicalDeviceInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaMedicalDeviceInfoTable, String> pharmaDeviceName =
		createColumn(
			"pharmaDeviceName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaMedicalDeviceInfoTable, String>
		pharmaDeviceDeisgnation = createColumn(
			"pharmaDeviceDeisgnation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaMedicalDeviceInfoTable, String>
		pharmaManufacturerName = createColumn(
			"pharmaManufacturerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaMedicalDeviceInfoTable, String>
		pharmaManufacturerAddress = createColumn(
			"pharmaManufacturerAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaMedicalDeviceInfoTable, String>
		pharmaMedicalApplicantName = createColumn(
			"pharmaMedicalApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaMedicalDeviceInfoTable, String>
		pharmaMedicalApplicantAddress = createColumn(
			"pharmaMedicalApplicantAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaMedicalDeviceInfoTable, String>
		pharmaRepresentativeName = createColumn(
			"pharmaRepresentativeName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaMedicalDeviceInfoTable, String>
		pharmaRepresentativeAddress = createColumn(
			"pharmaRepresentativeAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaMedicalDeviceInfoTable, Long>
		pharmaApplicationId = createColumn(
			"pharmaApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private PharmaMedicalDeviceInfoTable() {
		super("nbp_pharma_medical_device", PharmaMedicalDeviceInfoTable::new);
	}

}