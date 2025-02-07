/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jadsc_certif_verasity&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfVeracity
 * @generated
 */
public class JADSCCertificateOfVeracityTable
	extends BaseTable<JADSCCertificateOfVeracityTable> {

	public static final JADSCCertificateOfVeracityTable INSTANCE =
		new JADSCCertificateOfVeracityTable();

	public final Column<JADSCCertificateOfVeracityTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfVeracityTable, Long> jadscCOVId =
		createColumn(
			"jadscCOVId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<JADSCCertificateOfVeracityTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfVeracityTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfVeracityTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfVeracityTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfVeracityTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfVeracityTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfVeracityTable, String>
		veracityComName = createColumn(
			"veracityComName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfVeracityTable, String>
		veracityComPosition = createColumn(
			"veracityComPosition", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfVeracityTable, String>
		veracityComCompany = createColumn(
			"veracityComCompany", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfVeracityTable, Date>
		veracitySignedDate = createColumn(
			"veracitySignedDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfVeracityTable, String>
		veracitySignedTelephone = createColumn(
			"veracitySignedTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfVeracityTable, String>
		veracitySignedFax = createColumn(
			"veracitySignedFax", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfVeracityTable, String>
		veracitySignedAddress = createColumn(
			"veracitySignedAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfVeracityTable, Long>
		jadscApplicationId = createColumn(
			"jadscApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private JADSCCertificateOfVeracityTable() {
		super(
			"nbp_jadsc_certif_verasity", JADSCCertificateOfVeracityTable::new);
	}

}