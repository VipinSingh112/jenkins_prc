/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.base;

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

import com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird;
import com.nbp.janaac.application.form.service.service.AddFdaPersonnelThirdLocalService;
import com.nbp.janaac.application.form.service.service.persistence.AccCerBodyApplicantInfoPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccCerBodyGeneralPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccCerBodyInfoPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccCerBodyManageReqPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccCerBodyMngReqTwoPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccCerBodyPersonnelPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccCerBodyProdScopePersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccCerBodyScopePersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccInsBodiesManageSysPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccInsBodiesOrganizationPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccInsBodiesOtherReqPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccInsBodiesPhyResourcePersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccMediLabActivitiesDescPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccMediLabApplicationInfoPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccMediLabManagementReqPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccMediLabOrganizationPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccMediLabOtherReqPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccMediLabPhysicalResourcePersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccMediLabTestDescriptionPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccMediLabTestManageReqPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccMediLabTestResourceReqPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccMediLabTestStructuralPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccThirdPartyAppliInfoPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccThirdPartyScopePersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddCerApplicationInfoPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddCerPersonnelFirstPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddCerPersonnelSecondPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddCerPersonnelThirdPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddCerScopeServicePersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddCerScopeServiceThirdPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaAppliInfoPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaPersonnelFirstPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaPersonnelFourPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaPersonnelSecondPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaPersonnelThirdPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaScopeClientPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddInsApplicationInfoPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddInsOrgInfoFirstPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddInsOrgInfoSecondPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddInsOrgInfoThirdPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabAppliInfoPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabCalibraStrucReqSecPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabDescOfActivityPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalDescOfActiSecPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalOrganFirstPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalOrganSecPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalPhysicalFirstPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalPhysicalSecPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabResourceReqFirstPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabResourceReqSecPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabStructuralRequirementPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabTestStructuralReqSecPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLaboratoryPartOfOrgPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddOutsourcedActivitiesPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddPhyResourceFirstPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddPhyResourceSecPersistence;
import com.nbp.janaac.application.form.service.service.persistence.JanaacAppliCurrentStagePersistence;
import com.nbp.janaac.application.form.service.service.persistence.JanaacApplicationPaymentPersistence;
import com.nbp.janaac.application.form.service.service.persistence.JanaacApplicationPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the add fda personnel third local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.janaac.application.form.service.service.impl.AddFdaPersonnelThirdLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.janaac.application.form.service.service.impl.AddFdaPersonnelThirdLocalServiceImpl
 * @generated
 */
public abstract class AddFdaPersonnelThirdLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AddFdaPersonnelThirdLocalService, AopService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AddFdaPersonnelThirdLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.janaac.application.form.service.service.AddFdaPersonnelThirdLocalServiceUtil</code>.
	 */

	/**
	 * Adds the add fda personnel third to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelThird the add fda personnel third
	 * @return the add fda personnel third that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AddFdaPersonnelThird addAddFdaPersonnelThird(
		AddFdaPersonnelThird addFdaPersonnelThird) {

		addFdaPersonnelThird.setNew(true);

		return addFdaPersonnelThirdPersistence.update(addFdaPersonnelThird);
	}

	/**
	 * Creates a new add fda personnel third with the primary key. Does not add the add fda personnel third to the database.
	 *
	 * @param addFdaPersonnelThirdId the primary key for the new add fda personnel third
	 * @return the new add fda personnel third
	 */
	@Override
	@Transactional(enabled = false)
	public AddFdaPersonnelThird createAddFdaPersonnelThird(
		long addFdaPersonnelThirdId) {

		return addFdaPersonnelThirdPersistence.create(addFdaPersonnelThirdId);
	}

	/**
	 * Deletes the add fda personnel third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelThirdId the primary key of the add fda personnel third
	 * @return the add fda personnel third that was removed
	 * @throws PortalException if a add fda personnel third with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AddFdaPersonnelThird deleteAddFdaPersonnelThird(
			long addFdaPersonnelThirdId)
		throws PortalException {

		return addFdaPersonnelThirdPersistence.remove(addFdaPersonnelThirdId);
	}

	/**
	 * Deletes the add fda personnel third from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelThird the add fda personnel third
	 * @return the add fda personnel third that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AddFdaPersonnelThird deleteAddFdaPersonnelThird(
		AddFdaPersonnelThird addFdaPersonnelThird) {

		return addFdaPersonnelThirdPersistence.remove(addFdaPersonnelThird);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return addFdaPersonnelThirdPersistence.dslQuery(dslQuery);
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
			AddFdaPersonnelThird.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return addFdaPersonnelThirdPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelThirdModelImpl</code>.
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

		return addFdaPersonnelThirdPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelThirdModelImpl</code>.
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

		return addFdaPersonnelThirdPersistence.findWithDynamicQuery(
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
		return addFdaPersonnelThirdPersistence.countWithDynamicQuery(
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

		return addFdaPersonnelThirdPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public AddFdaPersonnelThird fetchAddFdaPersonnelThird(
		long addFdaPersonnelThirdId) {

		return addFdaPersonnelThirdPersistence.fetchByPrimaryKey(
			addFdaPersonnelThirdId);
	}

	/**
	 * Returns the add fda personnel third with the primary key.
	 *
	 * @param addFdaPersonnelThirdId the primary key of the add fda personnel third
	 * @return the add fda personnel third
	 * @throws PortalException if a add fda personnel third with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelThird getAddFdaPersonnelThird(
			long addFdaPersonnelThirdId)
		throws PortalException {

		return addFdaPersonnelThirdPersistence.findByPrimaryKey(
			addFdaPersonnelThirdId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			addFdaPersonnelThirdLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AddFdaPersonnelThird.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"addFdaPersonnelThirdId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			addFdaPersonnelThirdLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			AddFdaPersonnelThird.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"addFdaPersonnelThirdId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			addFdaPersonnelThirdLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AddFdaPersonnelThird.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"addFdaPersonnelThirdId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return addFdaPersonnelThirdPersistence.create(
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
				"Implement AddFdaPersonnelThirdLocalServiceImpl#deleteAddFdaPersonnelThird(AddFdaPersonnelThird) to avoid orphaned data");
		}

		return addFdaPersonnelThirdLocalService.deleteAddFdaPersonnelThird(
			(AddFdaPersonnelThird)persistedModel);
	}

	@Override
	public BasePersistence<AddFdaPersonnelThird> getBasePersistence() {
		return addFdaPersonnelThirdPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return addFdaPersonnelThirdPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the add fda personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @return the range of add fda personnel thirds
	 */
	@Override
	public List<AddFdaPersonnelThird> getAddFdaPersonnelThirds(
		int start, int end) {

		return addFdaPersonnelThirdPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of add fda personnel thirds.
	 *
	 * @return the number of add fda personnel thirds
	 */
	@Override
	public int getAddFdaPersonnelThirdsCount() {
		return addFdaPersonnelThirdPersistence.countAll();
	}

	/**
	 * Updates the add fda personnel third in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelThird the add fda personnel third
	 * @return the add fda personnel third that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AddFdaPersonnelThird updateAddFdaPersonnelThird(
		AddFdaPersonnelThird addFdaPersonnelThird) {

		return addFdaPersonnelThirdPersistence.update(addFdaPersonnelThird);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AddFdaPersonnelThirdLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		addFdaPersonnelThirdLocalService =
			(AddFdaPersonnelThirdLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AddFdaPersonnelThirdLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AddFdaPersonnelThird.class;
	}

	protected String getModelClassName() {
		return AddFdaPersonnelThird.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				addFdaPersonnelThirdPersistence.getDataSource();

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
	protected AccCerBodyApplicantInfoPersistence
		accCerBodyApplicantInfoPersistence;

	@Reference
	protected AccCerBodyGeneralPersistence accCerBodyGeneralPersistence;

	@Reference
	protected AccCerBodyInfoPersistence accCerBodyInfoPersistence;

	@Reference
	protected AccCerBodyManageReqPersistence accCerBodyManageReqPersistence;

	@Reference
	protected AccCerBodyMngReqTwoPersistence accCerBodyMngReqTwoPersistence;

	@Reference
	protected AccCerBodyPersonnelPersistence accCerBodyPersonnelPersistence;

	@Reference
	protected AccCerBodyProdScopePersistence accCerBodyProdScopePersistence;

	@Reference
	protected AccCerBodyScopePersistence accCerBodyScopePersistence;

	@Reference
	protected AccInsBodiesManageSysPersistence accInsBodiesManageSysPersistence;

	@Reference
	protected AccInsBodiesOrganizationPersistence
		accInsBodiesOrganizationPersistence;

	@Reference
	protected AccInsBodiesOtherReqPersistence accInsBodiesOtherReqPersistence;

	@Reference
	protected AccInsBodiesPhyResourcePersistence
		accInsBodiesPhyResourcePersistence;

	@Reference
	protected AccMediLabActivitiesDescPersistence
		accMediLabActivitiesDescPersistence;

	@Reference
	protected AccMediLabApplicationInfoPersistence
		accMediLabApplicationInfoPersistence;

	@Reference
	protected AccMediLabManagementReqPersistence
		accMediLabManagementReqPersistence;

	@Reference
	protected AccMediLabOrganizationPersistence
		accMediLabOrganizationPersistence;

	@Reference
	protected AccMediLabOtherReqPersistence accMediLabOtherReqPersistence;

	@Reference
	protected AccMediLabPhysicalResourcePersistence
		accMediLabPhysicalResourcePersistence;

	@Reference
	protected AccMediLabTestDescriptionPersistence
		accMediLabTestDescriptionPersistence;

	@Reference
	protected AccMediLabTestManageReqPersistence
		accMediLabTestManageReqPersistence;

	@Reference
	protected AccMediLabTestResourceReqPersistence
		accMediLabTestResourceReqPersistence;

	@Reference
	protected AccMediLabTestStructuralPersistence
		accMediLabTestStructuralPersistence;

	@Reference
	protected AccThirdPartyAppliInfoPersistence
		accThirdPartyAppliInfoPersistence;

	@Reference
	protected AccThirdPartyScopePersistence accThirdPartyScopePersistence;

	@Reference
	protected AddCerApplicationInfoPersistence addCerApplicationInfoPersistence;

	@Reference
	protected AddCerPersonnelFirstPersistence addCerPersonnelFirstPersistence;

	@Reference
	protected AddCerPersonnelSecondPersistence addCerPersonnelSecondPersistence;

	@Reference
	protected AddCerPersonnelThirdPersistence addCerPersonnelThirdPersistence;

	@Reference
	protected AddCerScopeServicePersistence addCerScopeServicePersistence;

	@Reference
	protected AddCerScopeServiceThirdPersistence
		addCerScopeServiceThirdPersistence;

	@Reference
	protected AddFdaAppliInfoPersistence addFdaAppliInfoPersistence;

	@Reference
	protected AddFdaPersonnelFirstPersistence addFdaPersonnelFirstPersistence;

	@Reference
	protected AddFdaPersonnelFourPersistence addFdaPersonnelFourPersistence;

	@Reference
	protected AddFdaPersonnelSecondPersistence addFdaPersonnelSecondPersistence;

	protected AddFdaPersonnelThirdLocalService addFdaPersonnelThirdLocalService;

	@Reference
	protected AddFdaPersonnelThirdPersistence addFdaPersonnelThirdPersistence;

	@Reference
	protected AddFdaScopeClientPersistence addFdaScopeClientPersistence;

	@Reference
	protected AddInsApplicationInfoPersistence addInsApplicationInfoPersistence;

	@Reference
	protected AddInsOrgInfoFirstPersistence addInsOrgInfoFirstPersistence;

	@Reference
	protected AddInsOrgInfoSecondPersistence addInsOrgInfoSecondPersistence;

	@Reference
	protected AddInsOrgInfoThirdPersistence addInsOrgInfoThirdPersistence;

	@Reference
	protected AddLabAppliInfoPersistence addLabAppliInfoPersistence;

	@Reference
	protected AddLabCalibraStrucReqSecPersistence
		addLabCalibraStrucReqSecPersistence;

	@Reference
	protected AddLabDescOfActivityPersistence addLabDescOfActivityPersistence;

	@Reference
	protected AddLabMedicalDescOfActiSecPersistence
		addLabMedicalDescOfActiSecPersistence;

	@Reference
	protected AddLabMedicalOrganFirstPersistence
		addLabMedicalOrganFirstPersistence;

	@Reference
	protected AddLabMedicalOrganSecPersistence addLabMedicalOrganSecPersistence;

	@Reference
	protected AddLabMedicalPhysicalFirstPersistence
		addLabMedicalPhysicalFirstPersistence;

	@Reference
	protected AddLabMedicalPhysicalSecPersistence
		addLabMedicalPhysicalSecPersistence;

	@Reference
	protected AddLaboratoryPartOfOrgPersistence
		addLaboratoryPartOfOrgPersistence;

	@Reference
	protected AddLabResourceReqFirstPersistence
		addLabResourceReqFirstPersistence;

	@Reference
	protected AddLabResourceReqSecPersistence addLabResourceReqSecPersistence;

	@Reference
	protected AddLabStructuralRequirementPersistence
		addLabStructuralRequirementPersistence;

	@Reference
	protected AddLabTestStructuralReqSecPersistence
		addLabTestStructuralReqSecPersistence;

	@Reference
	protected AddOutsourcedActivitiesPersistence
		addOutsourcedActivitiesPersistence;

	@Reference
	protected AddPhyResourceFirstPersistence addPhyResourceFirstPersistence;

	@Reference
	protected AddPhyResourceSecPersistence addPhyResourceSecPersistence;

	@Reference
	protected JanaacApplicationPersistence janaacApplicationPersistence;

	@Reference
	protected JanaacApplicationPaymentPersistence
		janaacApplicationPaymentPersistence;

	@Reference
	protected JanaacAppliCurrentStagePersistence
		janaacAppliCurrentStagePersistence;

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
		AddFdaPersonnelThirdLocalServiceBaseImpl.class);

}