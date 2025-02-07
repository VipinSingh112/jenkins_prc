/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

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

import com.nbp.mining.lease.application.service.exception.NoSuchMiningLeaseApplicationException;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for MiningLeaseApplication. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiningLeaseApplicationLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface MiningLeaseApplicationLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.mining.lease.application.service.service.impl.MiningLeaseApplicationLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the mining lease application local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link MiningLeaseApplicationLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the mining lease application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningLeaseApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningLeaseApplication the mining lease application
	 * @return the mining lease application that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MiningLeaseApplication addMiningLeaseApplication(
		MiningLeaseApplication miningLeaseApplication);

	/**
	 * Creates a new mining lease application with the primary key. Does not add the mining lease application to the database.
	 *
	 * @param miningLeaseApplicationId the primary key for the new mining lease application
	 * @return the new mining lease application
	 */
	@Transactional(enabled = false)
	public MiningLeaseApplication createMiningLeaseApplication(
		long miningLeaseApplicationId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the mining lease application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningLeaseApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application that was removed
	 * @throws PortalException if a mining lease application with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public MiningLeaseApplication deleteMiningLeaseApplication(
			long miningLeaseApplicationId)
		throws PortalException;

	/**
	 * Deletes the mining lease application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningLeaseApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningLeaseApplication the mining lease application
	 * @return the mining lease application that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public MiningLeaseApplication deleteMiningLeaseApplication(
		MiningLeaseApplication miningLeaseApplication);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningLeaseApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningLeaseApplicationModelImpl</code>.
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
	public MiningLeaseApplication fetchMiningLeaseApplication(
		long miningLeaseApplicationId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getJadscDistinctCategory();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiningLeaseApplication getMiningBy_PRNum_PLNum(
			String applicationNumber, String prospRightsNum)
		throws NoSuchMiningLeaseApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiningLeaseApplication getMiningByAppNum(String applicationNumber)
		throws NoSuchMiningLeaseApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiningLeaseApplication getMiningByCaseId(String caseId)
		throws NoSuchMiningLeaseApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiningLeaseApplication getMiningByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchMiningLeaseApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MiningLeaseApplication> getMiningByS_U(long userId, int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MiningLeaseApplication> getMiningByStatus(int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getMiningDistinctCategory();

	/**
	 * Returns the mining lease application with the primary key.
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application
	 * @throws PortalException if a mining lease application with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiningLeaseApplication getMiningLeaseApplication(
			long miningLeaseApplicationId)
		throws PortalException;

	/**
	 * Returns a range of all the mining lease applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of mining lease applications
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MiningLeaseApplication> getMiningLeaseApplications(
		int start, int end);

	/**
	 * Returns the number of mining lease applications.
	 *
	 * @return the number of mining lease applications
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getMiningLeaseApplicationsCount();

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
	 * Updates the mining lease application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningLeaseApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningLeaseApplication the mining lease application
	 * @return the mining lease application that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MiningLeaseApplication updateMiningLeaseApplication(
		MiningLeaseApplication miningLeaseApplication);

}