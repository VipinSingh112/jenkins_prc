/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.nbp.tourism.application.form.services.model.TourismBonaAttractionSignInfo;
import com.nbp.tourism.application.form.services.service.TourismBonaAttractionSignInfoLocalServiceUtil;

/**
 * The extended model base implementation for the TourismBonaAttractionSignInfo service. Represents a row in the &quot;nbp_tourism_attrac_sign&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismBonaAttractionSignInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionSignInfoImpl
 * @see TourismBonaAttractionSignInfo
 * @generated
 */
public abstract class TourismBonaAttractionSignInfoBaseImpl
	extends TourismBonaAttractionSignInfoModelImpl
	implements TourismBonaAttractionSignInfo {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism bona attraction sign info model instance should use the <code>TourismBonaAttractionSignInfo</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			TourismBonaAttractionSignInfoLocalServiceUtil.
				addTourismBonaAttractionSignInfo(this);
		}
		else {
			TourismBonaAttractionSignInfoLocalServiceUtil.
				updateTourismBonaAttractionSignInfo(this);
		}
	}

}