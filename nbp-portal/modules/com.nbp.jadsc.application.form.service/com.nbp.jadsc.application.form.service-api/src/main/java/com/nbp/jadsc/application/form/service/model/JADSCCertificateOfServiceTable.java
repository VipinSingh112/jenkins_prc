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
 * The table class for the &quot;nbp_jadsc_certif_servic&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfService
 * @generated
 */
public class JADSCCertificateOfServiceTable
	extends BaseTable<JADSCCertificateOfServiceTable> {

	public static final JADSCCertificateOfServiceTable INSTANCE =
		new JADSCCertificateOfServiceTable();

	public final Column<JADSCCertificateOfServiceTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceTable, Long> jadscCOSId =
		createColumn(
			"jadscCOSId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<JADSCCertificateOfServiceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceTable, Date> docSubmitDate =
		createColumn(
			"docSubmitDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceTable, String> signatoryName =
		createColumn(
			"signatoryName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceTable, Date> signatoryDate =
		createColumn(
			"signatoryDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceTable, String>
		signatoryTelephone = createColumn(
			"signatoryTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceTable, String> signatoryFax =
		createColumn(
			"signatoryFax", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceTable, Long>
		jadscApplicationId = createColumn(
			"jadscApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private JADSCCertificateOfServiceTable() {
		super("nbp_jadsc_certif_servic", JADSCCertificateOfServiceTable::new);
	}

}