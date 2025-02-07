/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

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

import com.nbp.acquire.stages.service.exception.NoSuchAcquireFinalExecutedAgreementException;
import com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for AcquireFinalExecutedAgreement. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireFinalExecutedAgreementLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface AcquireFinalExecutedAgreementLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.acquire.stages.service.service.impl.AcquireFinalExecutedAgreementLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the acquire final executed agreement local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link AcquireFinalExecutedAgreementLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the acquire final executed agreement to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireFinalExecutedAgreementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireFinalExecutedAgreement the acquire final executed agreement
	 * @return the acquire final executed agreement that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AcquireFinalExecutedAgreement addAcquireFinalExecutedAgreement(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement);

	/**
	 * Creates a new acquire final executed agreement with the primary key. Does not add the acquire final executed agreement to the database.
	 *
	 * @param acquirefinalId the primary key for the new acquire final executed agreement
	 * @return the new acquire final executed agreement
	 */
	@Transactional(enabled = false)
	public AcquireFinalExecutedAgreement createAcquireFinalExecutedAgreement(
		long acquirefinalId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the acquire final executed agreement from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireFinalExecutedAgreementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireFinalExecutedAgreement the acquire final executed agreement
	 * @return the acquire final executed agreement that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public AcquireFinalExecutedAgreement deleteAcquireFinalExecutedAgreement(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement);

	/**
	 * Deletes the acquire final executed agreement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireFinalExecutedAgreementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirefinalId the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement that was removed
	 * @throws PortalException if a acquire final executed agreement with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public AcquireFinalExecutedAgreement deleteAcquireFinalExecutedAgreement(
			long acquirefinalId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementModelImpl</code>.
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
	public AcquireFinalExecutedAgreement fetchAcquireFinalExecutedAgreement(
		long acquirefinalId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AcquireFinalExecutedAgreement getAcquireFinalAgreementBy_CI(
			String caseId)
		throws NoSuchAcquireFinalExecutedAgreementException;

	/**
	 * Returns the acquire final executed agreement with the primary key.
	 *
	 * @param acquirefinalId the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement
	 * @throws PortalException if a acquire final executed agreement with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AcquireFinalExecutedAgreement getAcquireFinalExecutedAgreement(
			long acquirefinalId)
		throws PortalException;

	/**
	 * Returns a range of all the acquire final executed agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire final executed agreements
	 * @param end the upper bound of the range of acquire final executed agreements (not inclusive)
	 * @return the range of acquire final executed agreements
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AcquireFinalExecutedAgreement>
		getAcquireFinalExecutedAgreements(int start, int end);

	/**
	 * Returns the number of acquire final executed agreements.
	 *
	 * @return the number of acquire final executed agreements
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getAcquireFinalExecutedAgreementsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

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
	 * Updates the acquire final executed agreement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireFinalExecutedAgreementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireFinalExecutedAgreement the acquire final executed agreement
	 * @return the acquire final executed agreement that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AcquireFinalExecutedAgreement updateAcquireFinalExecutedAgreement(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement);

	public AcquireFinalExecutedAgreement updateAcquireFinalExecutedAgreement(
		String caseId, Date dateContractExecuted);

}