/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.base;

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

import com.nbp.explosives.competency.application.form.service.model.BlasterCompetencyForm;
import com.nbp.explosives.competency.application.form.service.service.BlasterCompetencyFormLocalService;
import com.nbp.explosives.competency.application.form.service.service.persistence.BlasterCompetencyFormPersistence;
import com.nbp.explosives.competency.application.form.service.service.persistence.ExplosiveAppPaymentPersistence;
import com.nbp.explosives.competency.application.form.service.service.persistence.ExplosivesApplicationPersistence;
import com.nbp.explosives.competency.application.form.service.service.persistence.ExplosivesCurrentStagePersistence;
import com.nbp.explosives.competency.application.form.service.service.persistence.PyrotechnicCompetencyFormPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the blaster competency form local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.explosives.competency.application.form.service.service.impl.BlasterCompetencyFormLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.explosives.competency.application.form.service.service.impl.BlasterCompetencyFormLocalServiceImpl
 * @generated
 */
public abstract class BlasterCompetencyFormLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, BlasterCompetencyFormLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>BlasterCompetencyFormLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.explosives.competency.application.form.service.service.BlasterCompetencyFormLocalServiceUtil</code>.
	 */

	/**
	 * Adds the blaster competency form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BlasterCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param blasterCompetencyForm the blaster competency form
	 * @return the blaster competency form that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public BlasterCompetencyForm addBlasterCompetencyForm(
		BlasterCompetencyForm blasterCompetencyForm) {

		blasterCompetencyForm.setNew(true);

		return blasterCompetencyFormPersistence.update(blasterCompetencyForm);
	}

	/**
	 * Creates a new blaster competency form with the primary key. Does not add the blaster competency form to the database.
	 *
	 * @param blasterCompetencyFormId the primary key for the new blaster competency form
	 * @return the new blaster competency form
	 */
	@Override
	@Transactional(enabled = false)
	public BlasterCompetencyForm createBlasterCompetencyForm(
		long blasterCompetencyFormId) {

		return blasterCompetencyFormPersistence.create(blasterCompetencyFormId);
	}

	/**
	 * Deletes the blaster competency form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BlasterCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param blasterCompetencyFormId the primary key of the blaster competency form
	 * @return the blaster competency form that was removed
	 * @throws PortalException if a blaster competency form with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public BlasterCompetencyForm deleteBlasterCompetencyForm(
			long blasterCompetencyFormId)
		throws PortalException {

		return blasterCompetencyFormPersistence.remove(blasterCompetencyFormId);
	}

	/**
	 * Deletes the blaster competency form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BlasterCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param blasterCompetencyForm the blaster competency form
	 * @return the blaster competency form that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public BlasterCompetencyForm deleteBlasterCompetencyForm(
		BlasterCompetencyForm blasterCompetencyForm) {

		return blasterCompetencyFormPersistence.remove(blasterCompetencyForm);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return blasterCompetencyFormPersistence.dslQuery(dslQuery);
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
			BlasterCompetencyForm.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return blasterCompetencyFormPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.BlasterCompetencyFormModelImpl</code>.
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

		return blasterCompetencyFormPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.BlasterCompetencyFormModelImpl</code>.
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

		return blasterCompetencyFormPersistence.findWithDynamicQuery(
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
		return blasterCompetencyFormPersistence.countWithDynamicQuery(
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

		return blasterCompetencyFormPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public BlasterCompetencyForm fetchBlasterCompetencyForm(
		long blasterCompetencyFormId) {

		return blasterCompetencyFormPersistence.fetchByPrimaryKey(
			blasterCompetencyFormId);
	}

	/**
	 * Returns the blaster competency form with the primary key.
	 *
	 * @param blasterCompetencyFormId the primary key of the blaster competency form
	 * @return the blaster competency form
	 * @throws PortalException if a blaster competency form with the primary key could not be found
	 */
	@Override
	public BlasterCompetencyForm getBlasterCompetencyForm(
			long blasterCompetencyFormId)
		throws PortalException {

		return blasterCompetencyFormPersistence.findByPrimaryKey(
			blasterCompetencyFormId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			blasterCompetencyFormLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(BlasterCompetencyForm.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"blasterCompetencyFormId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			blasterCompetencyFormLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			BlasterCompetencyForm.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"blasterCompetencyFormId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			blasterCompetencyFormLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(BlasterCompetencyForm.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"blasterCompetencyFormId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return blasterCompetencyFormPersistence.create(
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
				"Implement BlasterCompetencyFormLocalServiceImpl#deleteBlasterCompetencyForm(BlasterCompetencyForm) to avoid orphaned data");
		}

		return blasterCompetencyFormLocalService.deleteBlasterCompetencyForm(
			(BlasterCompetencyForm)persistedModel);
	}

	@Override
	public BasePersistence<BlasterCompetencyForm> getBasePersistence() {
		return blasterCompetencyFormPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return blasterCompetencyFormPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the blaster competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.BlasterCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of blaster competency forms
	 * @param end the upper bound of the range of blaster competency forms (not inclusive)
	 * @return the range of blaster competency forms
	 */
	@Override
	public List<BlasterCompetencyForm> getBlasterCompetencyForms(
		int start, int end) {

		return blasterCompetencyFormPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of blaster competency forms.
	 *
	 * @return the number of blaster competency forms
	 */
	@Override
	public int getBlasterCompetencyFormsCount() {
		return blasterCompetencyFormPersistence.countAll();
	}

	/**
	 * Updates the blaster competency form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BlasterCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param blasterCompetencyForm the blaster competency form
	 * @return the blaster competency form that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public BlasterCompetencyForm updateBlasterCompetencyForm(
		BlasterCompetencyForm blasterCompetencyForm) {

		return blasterCompetencyFormPersistence.update(blasterCompetencyForm);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			BlasterCompetencyFormLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		blasterCompetencyFormLocalService =
			(BlasterCompetencyFormLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return BlasterCompetencyFormLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return BlasterCompetencyForm.class;
	}

	protected String getModelClassName() {
		return BlasterCompetencyForm.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				blasterCompetencyFormPersistence.getDataSource();

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

	protected BlasterCompetencyFormLocalService
		blasterCompetencyFormLocalService;

	@Reference
	protected BlasterCompetencyFormPersistence blasterCompetencyFormPersistence;

	@Reference
	protected ExplosiveAppPaymentPersistence explosiveAppPaymentPersistence;

	@Reference
	protected ExplosivesApplicationPersistence explosivesApplicationPersistence;

	@Reference
	protected ExplosivesCurrentStagePersistence
		explosivesCurrentStagePersistence;

	@Reference
	protected PyrotechnicCompetencyFormPersistence
		pyrotechnicCompetencyFormPersistence;

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
		BlasterCompetencyFormLocalServiceBaseImpl.class);

}