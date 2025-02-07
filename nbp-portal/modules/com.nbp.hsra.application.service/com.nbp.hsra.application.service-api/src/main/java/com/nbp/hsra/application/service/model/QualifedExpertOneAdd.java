/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the QualifedExpertOneAdd service. Represents a row in the &quot;nbp_hsra_quali_expert_one_add&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see QualifedExpertOneAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.application.service.model.impl.QualifedExpertOneAddImpl"
)
@ProviderType
public interface QualifedExpertOneAdd
	extends PersistedModel, QualifedExpertOneAddModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.application.service.model.impl.QualifedExpertOneAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<QualifedExpertOneAdd, Long>
		QUALIFED_EXPERT_ONE_ADD_ID_ACCESSOR =
			new Accessor<QualifedExpertOneAdd, Long>() {

				@Override
				public Long get(QualifedExpertOneAdd qualifedExpertOneAdd) {
					return qualifedExpertOneAdd.getQualifedExpertOneAddId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<QualifedExpertOneAdd> getTypeClass() {
					return QualifedExpertOneAdd.class;
				}

			};

}