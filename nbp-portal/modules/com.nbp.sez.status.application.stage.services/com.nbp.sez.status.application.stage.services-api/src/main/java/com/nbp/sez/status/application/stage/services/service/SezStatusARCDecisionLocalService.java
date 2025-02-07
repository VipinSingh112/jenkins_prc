/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

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

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusARCDecisionException;
import com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for SezStatusARCDecision. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusARCDecisionLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface SezStatusARCDecisionLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.sez.status.application.stage.services.service.impl.SezStatusARCDecisionLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the sez status arc decision local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link SezStatusARCDecisionLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the sez status arc decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusARCDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusARCDecision the sez status arc decision
	 * @return the sez status arc decision that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public SezStatusARCDecision addSezStatusARCDecision(
		SezStatusARCDecision sezStatusARCDecision);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Creates a new sez status arc decision with the primary key. Does not add the sez status arc decision to the database.
	 *
	 * @param sezStatusCommitteeId the primary key for the new sez status arc decision
	 * @return the new sez status arc decision
	 */
	@Transactional(enabled = false)
	public SezStatusARCDecision createSezStatusARCDecision(
		long sezStatusCommitteeId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the sez status arc decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusARCDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusCommitteeId the primary key of the sez status arc decision
	 * @return the sez status arc decision that was removed
	 * @throws PortalException if a sez status arc decision with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public SezStatusARCDecision deleteSezStatusARCDecision(
			long sezStatusCommitteeId)
		throws PortalException;

	/**
	 * Deletes the sez status arc decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusARCDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusARCDecision the sez status arc decision
	 * @return the sez status arc decision that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public SezStatusARCDecision deleteSezStatusARCDecision(
		SezStatusARCDecision sezStatusARCDecision);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusARCDecisionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusARCDecisionModelImpl</code>.
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
	public SezStatusARCDecision fetchSezStatusARCDecision(
		long sezStatusCommitteeId);

	/**
	 * Returns the sez status arc decision matching the UUID and group.
	 *
	 * @param uuid the sez status arc decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezStatusARCDecision fetchSezStatusARCDecisionByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

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

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezStatusARCDecision getSeStatusARCDecision_By_CI(String caseId)
		throws NoSuchSezStatusARCDecisionException;

	/**
	 * Returns the sez status arc decision with the primary key.
	 *
	 * @param sezStatusCommitteeId the primary key of the sez status arc decision
	 * @return the sez status arc decision
	 * @throws PortalException if a sez status arc decision with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezStatusARCDecision getSezStatusARCDecision(
			long sezStatusCommitteeId)
		throws PortalException;

	/**
	 * Returns the sez status arc decision matching the UUID and group.
	 *
	 * @param uuid the sez status arc decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status arc decision
	 * @throws PortalException if a matching sez status arc decision could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezStatusARCDecision getSezStatusARCDecisionByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the sez status arc decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @return the range of sez status arc decisions
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SezStatusARCDecision> getSezStatusARCDecisions(
		int start, int end);

	/**
	 * Returns all the sez status arc decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status arc decisions
	 * @param companyId the primary key of the company
	 * @return the matching sez status arc decisions, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SezStatusARCDecision>
		getSezStatusARCDecisionsByUuidAndCompanyId(String uuid, long companyId);

	/**
	 * Returns a range of sez status arc decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status arc decisions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching sez status arc decisions, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SezStatusARCDecision>
		getSezStatusARCDecisionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<SezStatusARCDecision> orderByComparator);

	/**
	 * Returns the number of sez status arc decisions.
	 *
	 * @return the number of sez status arc decisions
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSezStatusARCDecisionsCount();

	/**
	 * Updates the sez status arc decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusARCDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusARCDecision the sez status arc decision
	 * @return the sez status arc decision that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public SezStatusARCDecision updateSezStatusARCDecision(
		SezStatusARCDecision sezStatusARCDecision);

	public SezStatusARCDecision updateSezStatusARCDecision(
		String caseId, String committeeDecision, Date dateOfdecision);

}