/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_services_sup_doc_ind&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceSupportingDocInd
 * @generated
 */
public class OSIServiceSupportingDocIndTable
	extends BaseTable<OSIServiceSupportingDocIndTable> {

	public static final OSIServiceSupportingDocIndTable INSTANCE =
		new OSIServiceSupportingDocIndTable();

	public final Column<OSIServiceSupportingDocIndTable, Long>
		oSIServiceSupportingDocIndId = createColumn(
			"oSIServiceSupportingDocIndId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OSIServiceSupportingDocIndTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String>
		supportingDocCheckboxes = createColumn(
			"supportingDocCheckboxes", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String>
		nonProvisionReasonReq1 = createColumn(
			"nonProvisionReasonReq1", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Date>
		expectedDateReq1 = createColumn(
			"expectedDateReq1", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String>
		nonProvisionReasonReq2 = createColumn(
			"nonProvisionReasonReq2", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Date>
		expectedDateReq2 = createColumn(
			"expectedDateReq2", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String>
		nonProvisionReasonReq3 = createColumn(
			"nonProvisionReasonReq3", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Date>
		expectedDateReq3 = createColumn(
			"expectedDateReq3", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String>
		nonProvisionReasonReq4 = createColumn(
			"nonProvisionReasonReq4", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Date>
		expectedDateReq4 = createColumn(
			"expectedDateReq4", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String>
		nonProvisionReasonReq5 = createColumn(
			"nonProvisionReasonReq5", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Date>
		expectedDateReq5 = createColumn(
			"expectedDateReq5", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String>
		nonProvisionReasonReq6 = createColumn(
			"nonProvisionReasonReq6", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Date>
		expectedDateReq6 = createColumn(
			"expectedDateReq6", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String>
		nonProvisionReasonReq7 = createColumn(
			"nonProvisionReasonReq7", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Date>
		expectedDateReq7 = createColumn(
			"expectedDateReq7", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String>
		nonProvisionReasonReq8 = createColumn(
			"nonProvisionReasonReq8", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Date>
		expectedDateReq8 = createColumn(
			"expectedDateReq8", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String>
		nonProvisionReasonReq9 = createColumn(
			"nonProvisionReasonReq9", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Date>
		expectedDateReq9 = createColumn(
			"expectedDateReq9", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String>
		nonProvisionReasonReq10 = createColumn(
			"nonProvisionReasonReq10", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Date>
		expectedDateReq10 = createColumn(
			"expectedDateReq10", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String>
		nonProvisionReasonReq11 = createColumn(
			"nonProvisionReasonReq11", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Date>
		expectedDateReq11 = createColumn(
			"expectedDateReq11", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String>
		nonProvisionReasonReq12 = createColumn(
			"nonProvisionReasonReq12", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Date>
		expectedDateReq12 = createColumn(
			"expectedDateReq12", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, String> category =
		createColumn(
			"category", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OSIServiceSupportingDocIndTable, Long>
		osiServicesApplicationId = createColumn(
			"osiServicesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private OSIServiceSupportingDocIndTable() {
		super(
			"nbp_osi_services_sup_doc_ind",
			OSIServiceSupportingDocIndTable::new);
	}

}