/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.base;

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

import com.nbp.quary.application.form.service.model.QuarryGeneralInformation;
import com.nbp.quary.application.form.service.service.QuarryGeneralInformationLocalService;
import com.nbp.quary.application.form.service.service.persistence.DirectorDetailsAddPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationMachinesAndEquipmentPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationPaymentPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicatntInformationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryCurrentStagePersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryGeneralInformationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryInformaationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryMaterialInformationEquipmentListPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryMaterialInformationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryTransferApplicantInfoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the quarry general information local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.quary.application.form.service.service.impl.QuarryGeneralInformationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.quary.application.form.service.service.impl.QuarryGeneralInformationLocalServiceImpl
 * @generated
 */
public abstract class QuarryGeneralInformationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   QuarryGeneralInformationLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>QuarryGeneralInformationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.quary.application.form.service.service.QuarryGeneralInformationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the quarry general information to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryGeneralInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryGeneralInformation the quarry general information
	 * @return the quarry general information that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QuarryGeneralInformation addQuarryGeneralInformation(
		QuarryGeneralInformation quarryGeneralInformation) {

		quarryGeneralInformation.setNew(true);

		return quarryGeneralInformationPersistence.update(
			quarryGeneralInformation);
	}

	/**
	 * Creates a new quarry general information with the primary key. Does not add the quarry general information to the database.
	 *
	 * @param generalInfoId the primary key for the new quarry general information
	 * @return the new quarry general information
	 */
	@Override
	@Transactional(enabled = false)
	public QuarryGeneralInformation createQuarryGeneralInformation(
		long generalInfoId) {

		return quarryGeneralInformationPersistence.create(generalInfoId);
	}

	/**
	 * Deletes the quarry general information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryGeneralInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generalInfoId the primary key of the quarry general information
	 * @return the quarry general information that was removed
	 * @throws PortalException if a quarry general information with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QuarryGeneralInformation deleteQuarryGeneralInformation(
			long generalInfoId)
		throws PortalException {

		return quarryGeneralInformationPersistence.remove(generalInfoId);
	}

	/**
	 * Deletes the quarry general information from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryGeneralInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryGeneralInformation the quarry general information
	 * @return the quarry general information that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QuarryGeneralInformation deleteQuarryGeneralInformation(
		QuarryGeneralInformation quarryGeneralInformation) {

		return quarryGeneralInformationPersistence.remove(
			quarryGeneralInformation);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return quarryGeneralInformationPersistence.dslQuery(dslQuery);
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
			QuarryGeneralInformation.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return quarryGeneralInformationPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryGeneralInformationModelImpl</code>.
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

		return quarryGeneralInformationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryGeneralInformationModelImpl</code>.
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

		return quarryGeneralInformationPersistence.findWithDynamicQuery(
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
		return quarryGeneralInformationPersistence.countWithDynamicQuery(
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

		return quarryGeneralInformationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public QuarryGeneralInformation fetchQuarryGeneralInformation(
		long generalInfoId) {

		return quarryGeneralInformationPersistence.fetchByPrimaryKey(
			generalInfoId);
	}

	/**
	 * Returns the quarry general information with the primary key.
	 *
	 * @param generalInfoId the primary key of the quarry general information
	 * @return the quarry general information
	 * @throws PortalException if a quarry general information with the primary key could not be found
	 */
	@Override
	public QuarryGeneralInformation getQuarryGeneralInformation(
			long generalInfoId)
		throws PortalException {

		return quarryGeneralInformationPersistence.findByPrimaryKey(
			generalInfoId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			quarryGeneralInformationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(QuarryGeneralInformation.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("generalInfoId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			quarryGeneralInformationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			QuarryGeneralInformation.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"generalInfoId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			quarryGeneralInformationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(QuarryGeneralInformation.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("generalInfoId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return quarryGeneralInformationPersistence.create(
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
				"Implement QuarryGeneralInformationLocalServiceImpl#deleteQuarryGeneralInformation(QuarryGeneralInformation) to avoid orphaned data");
		}

		return quarryGeneralInformationLocalService.
			deleteQuarryGeneralInformation(
				(QuarryGeneralInformation)persistedModel);
	}

	@Override
	public BasePersistence<QuarryGeneralInformation> getBasePersistence() {
		return quarryGeneralInformationPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return quarryGeneralInformationPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the quarry general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry general informations
	 * @param end the upper bound of the range of quarry general informations (not inclusive)
	 * @return the range of quarry general informations
	 */
	@Override
	public List<QuarryGeneralInformation> getQuarryGeneralInformations(
		int start, int end) {

		return quarryGeneralInformationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of quarry general informations.
	 *
	 * @return the number of quarry general informations
	 */
	@Override
	public int getQuarryGeneralInformationsCount() {
		return quarryGeneralInformationPersistence.countAll();
	}

	/**
	 * Updates the quarry general information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryGeneralInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryGeneralInformation the quarry general information
	 * @return the quarry general information that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QuarryGeneralInformation updateQuarryGeneralInformation(
		QuarryGeneralInformation quarryGeneralInformation) {

		return quarryGeneralInformationPersistence.update(
			quarryGeneralInformation);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			QuarryGeneralInformationLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		quarryGeneralInformationLocalService =
			(QuarryGeneralInformationLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return QuarryGeneralInformationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return QuarryGeneralInformation.class;
	}

	protected String getModelClassName() {
		return QuarryGeneralInformation.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				quarryGeneralInformationPersistence.getDataSource();

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
	protected DirectorDetailsAddPersistence directorDetailsAddPersistence;

	@Reference
	protected QuarryApplicationPersistence quarryApplicationPersistence;

	@Reference
	protected QuarryApplicationMachinesAndEquipmentPersistence
		quarryApplicationMachinesAndEquipmentPersistence;

	@Reference
	protected QuarryApplicationPaymentPersistence
		quarryApplicationPaymentPersistence;

	@Reference
	protected QuarryApplicatntInformationPersistence
		quarryApplicatntInformationPersistence;

	@Reference
	protected QuarryCurrentStagePersistence quarryCurrentStagePersistence;

	protected QuarryGeneralInformationLocalService
		quarryGeneralInformationLocalService;

	@Reference
	protected QuarryGeneralInformationPersistence
		quarryGeneralInformationPersistence;

	@Reference
	protected QuarryInformaationPersistence quarryInformaationPersistence;

	@Reference
	protected QuarryMaterialInformationPersistence
		quarryMaterialInformationPersistence;

	@Reference
	protected QuarryMaterialInformationEquipmentListPersistence
		quarryMaterialInformationEquipmentListPersistence;

	@Reference
	protected QuarryTransferApplicantInfoPersistence
		quarryTransferApplicantInfoPersistence;

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
		QuarryGeneralInformationLocalServiceBaseImpl.class);

}