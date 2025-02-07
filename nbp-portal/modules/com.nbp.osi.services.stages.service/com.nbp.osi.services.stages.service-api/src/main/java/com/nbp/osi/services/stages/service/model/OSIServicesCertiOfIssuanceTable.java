/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_services_certi_of_issu&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesCertiOfIssuance
 * @generated
 */
public class OSIServicesCertiOfIssuanceTable
	extends BaseTable<OSIServicesCertiOfIssuanceTable> {

	public static final OSIServicesCertiOfIssuanceTable INSTANCE =
		new OSIServicesCertiOfIssuanceTable();

	public final Column<OSIServicesCertiOfIssuanceTable, Long>
		oSIServicesCertiOfIssuanceId = createColumn(
			"oSIServicesCertiOfIssuanceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OSIServicesCertiOfIssuanceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServicesCertiOfIssuanceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServicesCertiOfIssuanceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServicesCertiOfIssuanceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OSIServicesCertiOfIssuanceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServicesCertiOfIssuanceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServicesCertiOfIssuanceTable, String>
		nameOfInsolventPerson = createColumn(
			"nameOfInsolventPerson", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServicesCertiOfIssuanceTable, Date>
		dateCertificateIssued = createColumn(
			"dateCertificateIssued", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServicesCertiOfIssuanceTable, Date>
		dateOfExpiration = createColumn(
			"dateOfExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServicesCertiOfIssuanceTable, String>
		certificateNum = createColumn(
			"certificateNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OSIServicesCertiOfIssuanceTable, String>
		nameOfLicensedTrustee = createColumn(
			"nameOfLicensedTrustee", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServicesCertiOfIssuanceTable, Long> docFileEntry =
		createColumn(
			"docFileEntry", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServicesCertiOfIssuanceTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private OSIServicesCertiOfIssuanceTable() {
		super(
			"nbp_osi_services_certi_of_issu",
			OSIServicesCertiOfIssuanceTable::new);
	}

}