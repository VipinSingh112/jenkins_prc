/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AccMediLabTestManageReq service. Represents a row in the &quot;nbp_janaac_acc_med_test_manage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestManageReqModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AccMediLabTestManageReqImpl"
)
@ProviderType
public interface AccMediLabTestManageReq
	extends AccMediLabTestManageReqModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestManageReqImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AccMediLabTestManageReq, Long>
		ACC_MEDI_LAB_TEST_MANAGE_REQ_ID_ACCESSOR =
			new Accessor<AccMediLabTestManageReq, Long>() {

				@Override
				public Long get(
					AccMediLabTestManageReq accMediLabTestManageReq) {

					return accMediLabTestManageReq.
						getAccMediLabTestManageReqId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AccMediLabTestManageReq> getTypeClass() {
					return AccMediLabTestManageReq.class;
				}

			};

}