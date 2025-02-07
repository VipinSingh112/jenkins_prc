/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.base;

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

import com.nbp.medical.facilities.application.form.service.model.MedicalFaciltiesPayment;
import com.nbp.medical.facilities.application.form.service.service.MedicalFaciltiesPaymentLocalService;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalCurrentStagePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesAppPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesAppliInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesComDetailPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesHomeInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesHomeTwoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesMaterHomePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesNurseDetailPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesNurseStaffPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesQNursePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesSignInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFaciltiesPaymentPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalNurseStaffPremisesPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the medical facilties payment local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.medical.facilities.application.form.service.service.impl.MedicalFaciltiesPaymentLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.medical.facilities.application.form.service.service.impl.MedicalFaciltiesPaymentLocalServiceImpl
 * @generated
 */
public abstract class MedicalFaciltiesPaymentLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   MedicalFaciltiesPaymentLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>MedicalFaciltiesPaymentLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.medical.facilities.application.form.service.service.MedicalFaciltiesPaymentLocalServiceUtil</code>.
	 */

	/**
	 * Adds the medical facilties payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFaciltiesPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFaciltiesPayment the medical facilties payment
	 * @return the medical facilties payment that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MedicalFaciltiesPayment addMedicalFaciltiesPayment(
		MedicalFaciltiesPayment medicalFaciltiesPayment) {

		medicalFaciltiesPayment.setNew(true);

		return medicalFaciltiesPaymentPersistence.update(
			medicalFaciltiesPayment);
	}

	/**
	 * Creates a new medical facilties payment with the primary key. Does not add the medical facilties payment to the database.
	 *
	 * @param medicalFaciltiesPaymentId the primary key for the new medical facilties payment
	 * @return the new medical facilties payment
	 */
	@Override
	@Transactional(enabled = false)
	public MedicalFaciltiesPayment createMedicalFaciltiesPayment(
		long medicalFaciltiesPaymentId) {

		return medicalFaciltiesPaymentPersistence.create(
			medicalFaciltiesPaymentId);
	}

	/**
	 * Deletes the medical facilties payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFaciltiesPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFaciltiesPaymentId the primary key of the medical facilties payment
	 * @return the medical facilties payment that was removed
	 * @throws PortalException if a medical facilties payment with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MedicalFaciltiesPayment deleteMedicalFaciltiesPayment(
			long medicalFaciltiesPaymentId)
		throws PortalException {

		return medicalFaciltiesPaymentPersistence.remove(
			medicalFaciltiesPaymentId);
	}

	/**
	 * Deletes the medical facilties payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFaciltiesPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFaciltiesPayment the medical facilties payment
	 * @return the medical facilties payment that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MedicalFaciltiesPayment deleteMedicalFaciltiesPayment(
		MedicalFaciltiesPayment medicalFaciltiesPayment) {

		return medicalFaciltiesPaymentPersistence.remove(
			medicalFaciltiesPayment);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return medicalFaciltiesPaymentPersistence.dslQuery(dslQuery);
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
			MedicalFaciltiesPayment.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return medicalFaciltiesPaymentPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFaciltiesPaymentModelImpl</code>.
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

		return medicalFaciltiesPaymentPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFaciltiesPaymentModelImpl</code>.
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

		return medicalFaciltiesPaymentPersistence.findWithDynamicQuery(
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
		return medicalFaciltiesPaymentPersistence.countWithDynamicQuery(
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

		return medicalFaciltiesPaymentPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public MedicalFaciltiesPayment fetchMedicalFaciltiesPayment(
		long medicalFaciltiesPaymentId) {

		return medicalFaciltiesPaymentPersistence.fetchByPrimaryKey(
			medicalFaciltiesPaymentId);
	}

	/**
	 * Returns the medical facilties payment with the primary key.
	 *
	 * @param medicalFaciltiesPaymentId the primary key of the medical facilties payment
	 * @return the medical facilties payment
	 * @throws PortalException if a medical facilties payment with the primary key could not be found
	 */
	@Override
	public MedicalFaciltiesPayment getMedicalFaciltiesPayment(
			long medicalFaciltiesPaymentId)
		throws PortalException {

		return medicalFaciltiesPaymentPersistence.findByPrimaryKey(
			medicalFaciltiesPaymentId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			medicalFaciltiesPaymentLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MedicalFaciltiesPayment.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"medicalFaciltiesPaymentId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			medicalFaciltiesPaymentLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			MedicalFaciltiesPayment.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"medicalFaciltiesPaymentId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			medicalFaciltiesPaymentLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MedicalFaciltiesPayment.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"medicalFaciltiesPaymentId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return medicalFaciltiesPaymentPersistence.create(
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
				"Implement MedicalFaciltiesPaymentLocalServiceImpl#deleteMedicalFaciltiesPayment(MedicalFaciltiesPayment) to avoid orphaned data");
		}

		return medicalFaciltiesPaymentLocalService.
			deleteMedicalFaciltiesPayment(
				(MedicalFaciltiesPayment)persistedModel);
	}

	@Override
	public BasePersistence<MedicalFaciltiesPayment> getBasePersistence() {
		return medicalFaciltiesPaymentPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return medicalFaciltiesPaymentPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the medical facilties payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFaciltiesPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilties payments
	 * @param end the upper bound of the range of medical facilties payments (not inclusive)
	 * @return the range of medical facilties payments
	 */
	@Override
	public List<MedicalFaciltiesPayment> getMedicalFaciltiesPayments(
		int start, int end) {

		return medicalFaciltiesPaymentPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of medical facilties payments.
	 *
	 * @return the number of medical facilties payments
	 */
	@Override
	public int getMedicalFaciltiesPaymentsCount() {
		return medicalFaciltiesPaymentPersistence.countAll();
	}

	/**
	 * Updates the medical facilties payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFaciltiesPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFaciltiesPayment the medical facilties payment
	 * @return the medical facilties payment that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MedicalFaciltiesPayment updateMedicalFaciltiesPayment(
		MedicalFaciltiesPayment medicalFaciltiesPayment) {

		return medicalFaciltiesPaymentPersistence.update(
			medicalFaciltiesPayment);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			MedicalFaciltiesPaymentLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		medicalFaciltiesPaymentLocalService =
			(MedicalFaciltiesPaymentLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return MedicalFaciltiesPaymentLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return MedicalFaciltiesPayment.class;
	}

	protected String getModelClassName() {
		return MedicalFaciltiesPayment.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				medicalFaciltiesPaymentPersistence.getDataSource();

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
	protected MedicalCurrentStagePersistence medicalCurrentStagePersistence;

	@Reference
	protected MedicalFacilitiesAppPersistence medicalFacilitiesAppPersistence;

	@Reference
	protected MedicalFacilitiesAppliInfoPersistence
		medicalFacilitiesAppliInfoPersistence;

	@Reference
	protected MedicalFacilitiesComDetailPersistence
		medicalFacilitiesComDetailPersistence;

	@Reference
	protected MedicalFacilitiesHomeInfoPersistence
		medicalFacilitiesHomeInfoPersistence;

	@Reference
	protected MedicalFacilitiesHomeTwoPersistence
		medicalFacilitiesHomeTwoPersistence;

	@Reference
	protected MedicalFacilitiesMaterHomePersistence
		medicalFacilitiesMaterHomePersistence;

	@Reference
	protected MedicalFacilitiesNurseDetailPersistence
		medicalFacilitiesNurseDetailPersistence;

	@Reference
	protected MedicalFacilitiesNurseStaffPersistence
		medicalFacilitiesNurseStaffPersistence;

	@Reference
	protected MedicalFacilitiesQNursePersistence
		medicalFacilitiesQNursePersistence;

	@Reference
	protected MedicalFacilitiesSignInfoPersistence
		medicalFacilitiesSignInfoPersistence;

	protected MedicalFaciltiesPaymentLocalService
		medicalFaciltiesPaymentLocalService;

	@Reference
	protected MedicalFaciltiesPaymentPersistence
		medicalFaciltiesPaymentPersistence;

	@Reference
	protected MedicalNurseStaffPremisesPersistence
		medicalNurseStaffPremisesPersistence;

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
		MedicalFaciltiesPaymentLocalServiceBaseImpl.class);

}