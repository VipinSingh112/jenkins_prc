/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.base;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import com.nbp.manufacturing.application.form.service.model.ManuApplicationCurrentStage;
import com.nbp.manufacturing.application.form.service.service.ManuApplicationCurrentStageLocalService;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuAdditionalCompanyInfoPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuApplicationCurrentStagePersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuCompanyInfoAddressPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuCompanyInfoPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuEquipmentAddPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuEquipmentPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuExportDataPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuInternationalCertificatePersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManufacturingApplicationPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.PackagingProcessPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductionProcessPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductiveInputsFormAddPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductiveInputsFormPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the manu application current stage local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.manufacturing.application.form.service.service.impl.ManuApplicationCurrentStageLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.manufacturing.application.form.service.service.impl.ManuApplicationCurrentStageLocalServiceImpl
 * @generated
 */
public abstract class ManuApplicationCurrentStageLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   ManuApplicationCurrentStageLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>ManuApplicationCurrentStageLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.manufacturing.application.form.service.service.ManuApplicationCurrentStageLocalServiceUtil</code>.
	 */

	/**
	 * Adds the manu application current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuApplicationCurrentStage the manu application current stage
	 * @return the manu application current stage that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ManuApplicationCurrentStage addManuApplicationCurrentStage(
		ManuApplicationCurrentStage manuApplicationCurrentStage) {

		manuApplicationCurrentStage.setNew(true);

		return manuApplicationCurrentStagePersistence.update(
			manuApplicationCurrentStage);
	}

	/**
	 * Creates a new manu application current stage with the primary key. Does not add the manu application current stage to the database.
	 *
	 * @param manuApplicationCuurentStageId the primary key for the new manu application current stage
	 * @return the new manu application current stage
	 */
	@Override
	@Transactional(enabled = false)
	public ManuApplicationCurrentStage createManuApplicationCurrentStage(
		long manuApplicationCuurentStageId) {

		return manuApplicationCurrentStagePersistence.create(
			manuApplicationCuurentStageId);
	}

	/**
	 * Deletes the manu application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuApplicationCuurentStageId the primary key of the manu application current stage
	 * @return the manu application current stage that was removed
	 * @throws PortalException if a manu application current stage with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ManuApplicationCurrentStage deleteManuApplicationCurrentStage(
			long manuApplicationCuurentStageId)
		throws PortalException {

		return manuApplicationCurrentStagePersistence.remove(
			manuApplicationCuurentStageId);
	}

	/**
	 * Deletes the manu application current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuApplicationCurrentStage the manu application current stage
	 * @return the manu application current stage that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ManuApplicationCurrentStage deleteManuApplicationCurrentStage(
		ManuApplicationCurrentStage manuApplicationCurrentStage) {

		return manuApplicationCurrentStagePersistence.remove(
			manuApplicationCurrentStage);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return manuApplicationCurrentStagePersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			ManuApplicationCurrentStage.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return manuApplicationCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return manuApplicationCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return manuApplicationCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return manuApplicationCurrentStagePersistence.countWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return manuApplicationCurrentStagePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public ManuApplicationCurrentStage fetchManuApplicationCurrentStage(
		long manuApplicationCuurentStageId) {

		return manuApplicationCurrentStagePersistence.fetchByPrimaryKey(
			manuApplicationCuurentStageId);
	}

	/**
	 * Returns the manu application current stage with the primary key.
	 *
	 * @param manuApplicationCuurentStageId the primary key of the manu application current stage
	 * @return the manu application current stage
	 * @throws PortalException if a manu application current stage with the primary key could not be found
	 */
	@Override
	public ManuApplicationCurrentStage getManuApplicationCurrentStage(
			long manuApplicationCuurentStageId)
		throws PortalException {

		return manuApplicationCurrentStagePersistence.findByPrimaryKey(
			manuApplicationCuurentStageId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			manuApplicationCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(ManuApplicationCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"manuApplicationCuurentStageId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			manuApplicationCurrentStageLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			ManuApplicationCurrentStage.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"manuApplicationCuurentStageId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			manuApplicationCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(ManuApplicationCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"manuApplicationCuurentStageId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return manuApplicationCurrentStagePersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement ManuApplicationCurrentStageLocalServiceImpl#deleteManuApplicationCurrentStage(ManuApplicationCurrentStage) to avoid orphaned data");
		}

		return manuApplicationCurrentStageLocalService.
			deleteManuApplicationCurrentStage(
				(ManuApplicationCurrentStage)persistedModel);
	}

	@Override
	public BasePersistence<ManuApplicationCurrentStage> getBasePersistence() {
		return manuApplicationCurrentStagePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return manuApplicationCurrentStagePersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the manu application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @return the range of manu application current stages
	 */
	@Override
	public List<ManuApplicationCurrentStage> getManuApplicationCurrentStages(
		int start, int end) {

		return manuApplicationCurrentStagePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of manu application current stages.
	 *
	 * @return the number of manu application current stages
	 */
	@Override
	public int getManuApplicationCurrentStagesCount() {
		return manuApplicationCurrentStagePersistence.countAll();
	}

	/**
	 * Updates the manu application current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuApplicationCurrentStage the manu application current stage
	 * @return the manu application current stage that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ManuApplicationCurrentStage updateManuApplicationCurrentStage(
		ManuApplicationCurrentStage manuApplicationCurrentStage) {

		return manuApplicationCurrentStagePersistence.update(
			manuApplicationCurrentStage);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			ManuApplicationCurrentStageLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		manuApplicationCurrentStageLocalService =
			(ManuApplicationCurrentStageLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ManuApplicationCurrentStageLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return ManuApplicationCurrentStage.class;
	}

	protected String getModelClassName() {
		return ManuApplicationCurrentStage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				manuApplicationCurrentStagePersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@Reference
	protected ManuAdditionalCompanyInfoPersistence
		manuAdditionalCompanyInfoPersistence;

	protected ManuApplicationCurrentStageLocalService
		manuApplicationCurrentStageLocalService;

	@Reference
	protected ManuApplicationCurrentStagePersistence
		manuApplicationCurrentStagePersistence;

	@Reference
	protected ManuCompanyInfoPersistence manuCompanyInfoPersistence;

	@Reference
	protected ManuCompanyInfoAddressPersistence
		manuCompanyInfoAddressPersistence;

	@Reference
	protected ManuEquipmentPersistence manuEquipmentPersistence;

	@Reference
	protected ManuEquipmentAddPersistence manuEquipmentAddPersistence;

	@Reference
	protected ManuExportDataPersistence manuExportDataPersistence;

	@Reference
	protected ManufacturingApplicationPersistence
		manufacturingApplicationPersistence;

	@Reference
	protected ManuInternationalCertificatePersistence
		manuInternationalCertificatePersistence;

	@Reference
	protected PackagingProcessPersistence packagingProcessPersistence;

	@Reference
	protected ProductionProcessPersistence productionProcessPersistence;

	@Reference
	protected ProductiveInputsFormPersistence productiveInputsFormPersistence;

	@Reference
	protected ProductiveInputsFormAddPersistence
		productiveInputsFormAddPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		ManuApplicationCurrentStageLocalServiceBaseImpl.class);

}