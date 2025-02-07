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
 * The extended model interface for the AddLabResourceReqSec service. Represents a row in the &quot;nbp_janaac_add_lab_res_req_sec&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabResourceReqSecModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AddLabResourceReqSecImpl"
)
@ProviderType
public interface AddLabResourceReqSec
	extends AddLabResourceReqSecModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AddLabResourceReqSecImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AddLabResourceReqSec, Long>
		ADD_LAB_RESOURCE_REQ_SEC_ID_ACCESSOR =
			new Accessor<AddLabResourceReqSec, Long>() {

				@Override
				public Long get(AddLabResourceReqSec addLabResourceReqSec) {
					return addLabResourceReqSec.getAddLabResourceReqSecId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AddLabResourceReqSec> getTypeClass() {
					return AddLabResourceReqSec.class;
				}

			};

}