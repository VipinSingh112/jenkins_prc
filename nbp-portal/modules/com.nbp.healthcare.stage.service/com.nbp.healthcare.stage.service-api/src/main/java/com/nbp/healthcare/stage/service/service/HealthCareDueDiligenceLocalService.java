/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.stage.service.exception.NoSuchHealthCareDueDiligenceException;
import com.nbp.healthcare.stage.service.model.HealthCareDueDiligence;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for HealthCareDueDiligence. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDueDiligenceLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface HealthCareDueDiligenceLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.healthcare.stage.service.service.impl.HealthCareDueDiligenceLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the health care due diligence local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link HealthCareDueDiligenceLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the health care due diligence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareDueDiligence the health care due diligence
	 * @return the health care due diligence that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public HealthCareDueDiligence addHealthCareDueDiligence(
		HealthCareDueDiligence healthCareDueDiligence);

	/**
	 * Creates a new health care due diligence with the primary key. Does not add the health care due diligence to the database.
	 *
	 * @param healthDDId the primary key for the new health care due diligence
	 * @return the new health care due diligence
	 */
	@Transactional(enabled = false)
	public HealthCareDueDiligence createHealthCareDueDiligence(long healthDDId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the health care due diligence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareDueDiligence the health care due diligence
	 * @return the health care due diligence that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public HealthCareDueDiligence deleteHealthCareDueDiligence(
		HealthCareDueDiligence healthCareDueDiligence);

	/**
	 * Deletes the health care due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence that was removed
	 * @throws PortalException if a health care due diligence with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public HealthCareDueDiligence deleteHealthCareDueDiligence(long healthDDId)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> T dslQuery(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int dslQueryCount(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCareDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCareDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public HealthCareDueDiligence fetchHealthCareDueDiligence(long healthDDId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getDistinctAgencies();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public HealthCareDueDiligence getHealthCareBy_CI(String caseId)
		throws NoSuchHealthCareDueDiligenceException;

	/**
	 * Returns the health care due diligence with the primary key.
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence
	 * @throws PortalException if a health care due diligence with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public HealthCareDueDiligence getHealthCareDueDiligence(long healthDDId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public HealthCareDueDiligence getHealthCareDueDiligenceBy_CI_SN(
			String caseId, String agncyName)
		throws NoSuchHealthCareDueDiligenceException;

	/**
	 * Returns a range of all the health care due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCareDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care due diligences
	 * @param end the upper bound of the range of health care due diligences (not inclusive)
	 * @return the range of health care due diligences
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<HealthCareDueDiligence> getHealthCareDueDiligences(
		int start, int end);

	/**
	 * Returns the number of health care due diligences.
	 *
	 * @return the number of health care due diligences
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getHealthCareDueDiligencesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the health care due diligence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareDueDiligence the health care due diligence
	 * @return the health care due diligence that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public HealthCareDueDiligence updateHealthCareDueDiligence(
		HealthCareDueDiligence healthCareDueDiligence);

	public HealthCareDueDiligence updateHealthCareDueDiligence(
		String caseId, Date dateSubmittedAgency, String nameofAgency,
		String Status, Date feedbackReceived);

	public HealthCareDueDiligence updateHealthCareDueDiligence(
		String caseId, Date dateSubmittedAgency, String nameofAgency,
		String Status, Date feedbackReceived, String reasonForObejction,
		String agencyDecision);

	public HealthCareDueDiligence updateHealthCareDueDiligence(
		String caseId, Date dateSubmittedAgency, String nameofAgency,
		String Status, Date feedbackReceived, String reasonForObejction,
		String agencyDecision, String durationOfPeriod);

	public HealthCareDueDiligence updateHealthCareDueDiligence(
		String caseId, Date dateSubmittedAgency, String nameofAgency,
		String Status, String feedbackReceived, Date date);

}