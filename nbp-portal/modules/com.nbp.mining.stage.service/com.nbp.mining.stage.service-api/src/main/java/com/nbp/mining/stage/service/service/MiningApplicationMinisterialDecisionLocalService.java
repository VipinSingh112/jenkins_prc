/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
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

import com.nbp.mining.stage.service.exception.NoSuchMiningApplicationMinisterialDecisionException;
import com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for MiningApplicationMinisterialDecision. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationMinisterialDecisionLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface MiningApplicationMinisterialDecisionLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.mining.stage.service.service.impl.MiningApplicationMinisterialDecisionLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the mining application ministerial decision local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link MiningApplicationMinisterialDecisionLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the mining application ministerial decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationMinisterialDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationMinisterialDecision the mining application ministerial decision
	 * @return the mining application ministerial decision that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MiningApplicationMinisterialDecision
		addMiningApplicationMinisterialDecision(
			MiningApplicationMinisterialDecision
				miningApplicationMinisterialDecision);

	/**
	 * Creates a new mining application ministerial decision with the primary key. Does not add the mining application ministerial decision to the database.
	 *
	 * @param miningDecId the primary key for the new mining application ministerial decision
	 * @return the new mining application ministerial decision
	 */
	@Transactional(enabled = false)
	public MiningApplicationMinisterialDecision
		createMiningApplicationMinisterialDecision(long miningDecId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the mining application ministerial decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationMinisterialDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningDecId the primary key of the mining application ministerial decision
	 * @return the mining application ministerial decision that was removed
	 * @throws PortalException if a mining application ministerial decision with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public MiningApplicationMinisterialDecision
			deleteMiningApplicationMinisterialDecision(long miningDecId)
		throws PortalException;

	/**
	 * Deletes the mining application ministerial decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationMinisterialDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationMinisterialDecision the mining application ministerial decision
	 * @return the mining application ministerial decision that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public MiningApplicationMinisterialDecision
		deleteMiningApplicationMinisterialDecision(
			MiningApplicationMinisterialDecision
				miningApplicationMinisterialDecision);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationMinisterialDecisionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationMinisterialDecisionModelImpl</code>.
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
	public MiningApplicationMinisterialDecision
		fetchMiningApplicationMinisterialDecision(long miningDecId);

	/**
	 * Returns the mining application ministerial decision matching the UUID and group.
	 *
	 * @param uuid the mining application ministerial decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiningApplicationMinisterialDecision
		fetchMiningApplicationMinisterialDecisionByUuidAndGroupId(
			String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the mining application ministerial decision with the primary key.
	 *
	 * @param miningDecId the primary key of the mining application ministerial decision
	 * @return the mining application ministerial decision
	 * @throws PortalException if a mining application ministerial decision with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiningApplicationMinisterialDecision
			getMiningApplicationMinisterialDecision(long miningDecId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiningApplicationMinisterialDecision
			getMiningApplicationMinisterialDecisionByCI(String caseId)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Returns the mining application ministerial decision matching the UUID and group.
	 *
	 * @param uuid the mining application ministerial decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application ministerial decision
	 * @throws PortalException if a matching mining application ministerial decision could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiningApplicationMinisterialDecision
			getMiningApplicationMinisterialDecisionByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the mining application ministerial decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @return the range of mining application ministerial decisions
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MiningApplicationMinisterialDecision>
		getMiningApplicationMinisterialDecisions(int start, int end);

	/**
	 * Returns all the mining application ministerial decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application ministerial decisions
	 * @param companyId the primary key of the company
	 * @return the matching mining application ministerial decisions, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MiningApplicationMinisterialDecision>
		getMiningApplicationMinisterialDecisionsByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of mining application ministerial decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application ministerial decisions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching mining application ministerial decisions, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MiningApplicationMinisterialDecision>
		getMiningApplicationMinisterialDecisionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MiningApplicationMinisterialDecision>
				orderByComparator);

	/**
	 * Returns the number of mining application ministerial decisions.
	 *
	 * @return the number of mining application ministerial decisions
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getMiningApplicationMinisterialDecisionsCount();

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
	 * Updates the mining application ministerial decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationMinisterialDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationMinisterialDecision the mining application ministerial decision
	 * @return the mining application ministerial decision that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MiningApplicationMinisterialDecision
		updateMiningApplicationMinisterialDecision(
			MiningApplicationMinisterialDecision
				miningApplicationMinisterialDecision);

	public MiningApplicationMinisterialDecision updateMiningMinisterialDecision(
		String caseId, String committeeDecision,
		java.sql.Date dateofCommitteeDecision, java.sql.Date dateOfExpiration,
		String certificateNumber);

	public MiningApplicationMinisterialDecision updateMiningMinisterialDecision(
		String caseId, String committeeDecision, Date dateofCommitteeDecision,
		Date dateOfExpiration, String certificateNumber);

}