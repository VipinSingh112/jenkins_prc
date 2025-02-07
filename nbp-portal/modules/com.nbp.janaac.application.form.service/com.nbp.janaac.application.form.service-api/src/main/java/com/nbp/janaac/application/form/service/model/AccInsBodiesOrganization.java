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
 * The extended model interface for the AccInsBodiesOrganization service. Represents a row in the &quot;nbp_janaac_acc_ins_body_org&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOrganizationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOrganizationImpl"
)
@ProviderType
public interface AccInsBodiesOrganization
	extends AccInsBodiesOrganizationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOrganizationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AccInsBodiesOrganization, Long>
		ACC_INS_BODIES_ORGANIZATION_ID_ACCESSOR =
			new Accessor<AccInsBodiesOrganization, Long>() {

				@Override
				public Long get(
					AccInsBodiesOrganization accInsBodiesOrganization) {

					return accInsBodiesOrganization.
						getAccInsBodiesOrganizationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AccInsBodiesOrganization> getTypeClass() {
					return AccInsBodiesOrganization.class;
				}

			};

}