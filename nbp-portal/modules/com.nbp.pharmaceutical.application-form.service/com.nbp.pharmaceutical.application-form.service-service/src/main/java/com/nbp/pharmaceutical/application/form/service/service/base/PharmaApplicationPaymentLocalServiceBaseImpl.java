/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.base;

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

import com.nbp.pharmaceutical.application.form.service.model.PharmaApplicationPayment;
import com.nbp.pharmaceutical.application.form.service.service.PharmaApplicationPaymentLocalService;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaApplicationPaymentPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaApplicationPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaCancellationFormPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaCurrentStagePersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaDocumentListPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaDrugInfoPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaManufacturerInfoPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaMedicalDeviceInfoPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaRecallFormPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaSubCategoriesMappingPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the pharma application payment local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.pharmaceutical.application.form.service.service.impl.PharmaApplicationPaymentLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.pharmaceutical.application.form.service.service.impl.PharmaApplicationPaymentLocalServiceImpl
 * @generated
 */
public abstract class PharmaApplicationPaymentLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   PharmaApplicationPaymentLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>PharmaApplicationPaymentLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.pharmaceutical.application.form.service.service.PharmaApplicationPaymentLocalServiceUtil</code>.
	 */

	/**
	 * Adds the pharma application payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationPayment the pharma application payment
	 * @return the pharma application payment that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PharmaApplicationPayment addPharmaApplicationPayment(
		PharmaApplicationPayment pharmaApplicationPayment) {

		pharmaApplicationPayment.setNew(true);

		return pharmaApplicationPaymentPersistence.update(
			pharmaApplicationPayment);
	}

	/**
	 * Creates a new pharma application payment with the primary key. Does not add the pharma application payment to the database.
	 *
	 * @param pharmaApplicationPaymentId the primary key for the new pharma application payment
	 * @return the new pharma application payment
	 */
	@Override
	@Transactional(enabled = false)
	public PharmaApplicationPayment createPharmaApplicationPayment(
		long pharmaApplicationPaymentId) {

		return pharmaApplicationPaymentPersistence.create(
			pharmaApplicationPaymentId);
	}

	/**
	 * Deletes the pharma application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationPaymentId the primary key of the pharma application payment
	 * @return the pharma application payment that was removed
	 * @throws PortalException if a pharma application payment with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PharmaApplicationPayment deletePharmaApplicationPayment(
			long pharmaApplicationPaymentId)
		throws PortalException {

		return pharmaApplicationPaymentPersistence.remove(
			pharmaApplicationPaymentId);
	}

	/**
	 * Deletes the pharma application payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationPayment the pharma application payment
	 * @return the pharma application payment that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PharmaApplicationPayment deletePharmaApplicationPayment(
		PharmaApplicationPayment pharmaApplicationPayment) {

		return pharmaApplicationPaymentPersistence.remove(
			pharmaApplicationPayment);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return pharmaApplicationPaymentPersistence.dslQuery(dslQuery);
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
			PharmaApplicationPayment.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return pharmaApplicationPaymentPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationPaymentModelImpl</code>.
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

		return pharmaApplicationPaymentPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationPaymentModelImpl</code>.
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

		return pharmaApplicationPaymentPersistence.findWithDynamicQuery(
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
		return pharmaApplicationPaymentPersistence.countWithDynamicQuery(
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

		return pharmaApplicationPaymentPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public PharmaApplicationPayment fetchPharmaApplicationPayment(
		long pharmaApplicationPaymentId) {

		return pharmaApplicationPaymentPersistence.fetchByPrimaryKey(
			pharmaApplicationPaymentId);
	}

	/**
	 * Returns the pharma application payment with the primary key.
	 *
	 * @param pharmaApplicationPaymentId the primary key of the pharma application payment
	 * @return the pharma application payment
	 * @throws PortalException if a pharma application payment with the primary key could not be found
	 */
	@Override
	public PharmaApplicationPayment getPharmaApplicationPayment(
			long pharmaApplicationPaymentId)
		throws PortalException {

		return pharmaApplicationPaymentPersistence.findByPrimaryKey(
			pharmaApplicationPaymentId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			pharmaApplicationPaymentLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(PharmaApplicationPayment.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"pharmaApplicationPaymentId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			pharmaApplicationPaymentLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			PharmaApplicationPayment.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"pharmaApplicationPaymentId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			pharmaApplicationPaymentLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(PharmaApplicationPayment.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"pharmaApplicationPaymentId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return pharmaApplicationPaymentPersistence.create(
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
				"Implement PharmaApplicationPaymentLocalServiceImpl#deletePharmaApplicationPayment(PharmaApplicationPayment) to avoid orphaned data");
		}

		return pharmaApplicationPaymentLocalService.
			deletePharmaApplicationPayment(
				(PharmaApplicationPayment)persistedModel);
	}

	@Override
	public BasePersistence<PharmaApplicationPayment> getBasePersistence() {
		return pharmaApplicationPaymentPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return pharmaApplicationPaymentPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the pharma application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application payments
	 * @param end the upper bound of the range of pharma application payments (not inclusive)
	 * @return the range of pharma application payments
	 */
	@Override
	public List<PharmaApplicationPayment> getPharmaApplicationPayments(
		int start, int end) {

		return pharmaApplicationPaymentPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of pharma application payments.
	 *
	 * @return the number of pharma application payments
	 */
	@Override
	public int getPharmaApplicationPaymentsCount() {
		return pharmaApplicationPaymentPersistence.countAll();
	}

	/**
	 * Updates the pharma application payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationPayment the pharma application payment
	 * @return the pharma application payment that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PharmaApplicationPayment updatePharmaApplicationPayment(
		PharmaApplicationPayment pharmaApplicationPayment) {

		return pharmaApplicationPaymentPersistence.update(
			pharmaApplicationPayment);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			PharmaApplicationPaymentLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		pharmaApplicationPaymentLocalService =
			(PharmaApplicationPaymentLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return PharmaApplicationPaymentLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return PharmaApplicationPayment.class;
	}

	protected String getModelClassName() {
		return PharmaApplicationPayment.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				pharmaApplicationPaymentPersistence.getDataSource();

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
	protected PharmaApplicationPersistence pharmaApplicationPersistence;

	protected PharmaApplicationPaymentLocalService
		pharmaApplicationPaymentLocalService;

	@Reference
	protected PharmaApplicationPaymentPersistence
		pharmaApplicationPaymentPersistence;

	@Reference
	protected PharmaCancellationFormPersistence
		pharmaCancellationFormPersistence;

	@Reference
	protected PharmaCurrentStagePersistence pharmaCurrentStagePersistence;

	@Reference
	protected PharmaDocumentListPersistence pharmaDocumentListPersistence;

	@Reference
	protected PharmaDrugInfoPersistence pharmaDrugInfoPersistence;

	@Reference
	protected PharmaManufacturerInfoPersistence
		pharmaManufacturerInfoPersistence;

	@Reference
	protected PharmaMedicalDeviceInfoPersistence
		pharmaMedicalDeviceInfoPersistence;

	@Reference
	protected PharmaRecallFormPersistence pharmaRecallFormPersistence;

	@Reference
	protected PharmaSubCategoriesMappingPersistence
		pharmaSubCategoriesMappingPersistence;

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
		PharmaApplicationPaymentLocalServiceBaseImpl.class);

}