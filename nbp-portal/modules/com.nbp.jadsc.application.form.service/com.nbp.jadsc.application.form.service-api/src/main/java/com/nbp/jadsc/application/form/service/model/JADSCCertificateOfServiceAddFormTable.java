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
 * The table class for the &quot;nbp_jadsc_certif_servic_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfServiceAddForm
 * @generated
 */
public class JADSCCertificateOfServiceAddFormTable
	extends BaseTable<JADSCCertificateOfServiceAddFormTable> {

	public static final JADSCCertificateOfServiceAddFormTable INSTANCE =
		new JADSCCertificateOfServiceAddFormTable();

	public final Column<JADSCCertificateOfServiceAddFormTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceAddFormTable, Long>
		jadscCOSId = createColumn(
			"jadscCOSId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<JADSCCertificateOfServiceAddFormTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceAddFormTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceAddFormTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceAddFormTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceAddFormTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceAddFormTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceAddFormTable, String>
		docServeCom = createColumn(
			"docServeCom", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceAddFormTable, String>
		docServeAddress = createColumn(
			"docServeAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceAddFormTable, String>
		docServeName = createColumn(
			"docServeName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceAddFormTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCCertificateOfServiceAddFormTable, Long>
		jadscApplicationId = createColumn(
			"jadscApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private JADSCCertificateOfServiceAddFormTable() {
		super(
			"nbp_jadsc_certif_servic_add",
			JADSCCertificateOfServiceAddFormTable::new);
	}

}