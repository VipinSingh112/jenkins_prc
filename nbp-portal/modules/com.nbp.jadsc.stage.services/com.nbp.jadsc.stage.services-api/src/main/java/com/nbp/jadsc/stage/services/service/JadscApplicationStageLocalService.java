/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

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

import com.nbp.jadsc.stage.services.exception.NoSuchJadscApplicationStageException;
import com.nbp.jadsc.stage.services.model.JadscApplicationStage;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for JadscApplicationStage. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationStageLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface JadscApplicationStageLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.jadsc.stage.services.service.impl.JadscApplicationStageLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the jadsc application stage local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link JadscApplicationStageLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the jadsc application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationStage the jadsc application stage
	 * @return the jadsc application stage that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public JadscApplicationStage addJadscApplicationStage(
		JadscApplicationStage jadscApplicationStage);

	/**
	 * Creates a new jadsc application stage with the primary key. Does not add the jadsc application stage to the database.
	 *
	 * @param jadscAppStageId the primary key for the new jadsc application stage
	 * @return the new jadsc application stage
	 */
	@Transactional(enabled = false)
	public JadscApplicationStage createJadscApplicationStage(
		long jadscAppStageId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the jadsc application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationStage the jadsc application stage
	 * @return the jadsc application stage that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public JadscApplicationStage deleteJadscApplicationStage(
		JadscApplicationStage jadscApplicationStage);

	/**
	 * Deletes the jadsc application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage that was removed
	 * @throws PortalException if a jadsc application stage with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public JadscApplicationStage deleteJadscApplicationStage(
			long jadscAppStageId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageModelImpl</code>.
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
	public JadscApplicationStage fetchJadscApplicationStage(
		long jadscAppStageId);

	/**
	 * Returns the jadsc application stage matching the UUID and group.
	 *
	 * @param uuid the jadsc application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JadscApplicationStage fetchJadscApplicationStageByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public String getJadscApplicationCurrentStages(String caseId);

	/**
	 * Returns the jadsc application stage with the primary key.
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage
	 * @throws PortalException if a jadsc application stage with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JadscApplicationStage getJadscApplicationStage(long jadscAppStageId)
		throws PortalException;

	/**
	 * Returns the jadsc application stage matching the UUID and group.
	 *
	 * @param uuid the jadsc application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc application stage
	 * @throws PortalException if a matching jadsc application stage could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JadscApplicationStage getJadscApplicationStageByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the jadsc application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of jadsc application stages
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JadscApplicationStage> getJadscApplicationStages(
		int start, int end);

	/**
	 * Returns all the jadsc application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc application stages
	 * @param companyId the primary key of the company
	 * @return the matching jadsc application stages, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JadscApplicationStage>
		getJadscApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of jadsc application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc application stages, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JadscApplicationStage>
		getJadscApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<JadscApplicationStage> orderByComparator);

	/**
	 * Returns the number of jadsc application stages.
	 *
	 * @return the number of jadsc application stages
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getJadscApplicationStagesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JadscApplicationStage getJadscBy_CI(String caseId)
		throws NoSuchJadscApplicationStageException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JadscApplicationStage> getJadscByCI(String caseId)
		throws NoSuchJadscApplicationStageException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JadscApplicationStage getJadscByCI_SN(
			String caseId, String stageName)
		throws NoSuchJadscApplicationStageException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JadscApplicationStage getJadscByCI_ST(
			String caseId, String stageStatus)
		throws NoSuchJadscApplicationStageException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JadscApplicationStage getJadscByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws NoSuchJadscApplicationStageException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getJadscDistinctStages();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Long getJadscSeenCases();

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

	public List<JadscApplicationStage> gtJadscApplicationStage_By_SN(
		String stageName);

	/**
	 * Updates the jadsc application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationStage the jadsc application stage
	 * @return the jadsc application stage that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public JadscApplicationStage updateJadscApplicationStage(
		JadscApplicationStage jadscApplicationStage);

	public JadscApplicationStage updateJadscApplicationStage(
		String caseId, String stageName, Date stageStartDate, Date stageEndDate,
		String duration, String stageStatus);

}