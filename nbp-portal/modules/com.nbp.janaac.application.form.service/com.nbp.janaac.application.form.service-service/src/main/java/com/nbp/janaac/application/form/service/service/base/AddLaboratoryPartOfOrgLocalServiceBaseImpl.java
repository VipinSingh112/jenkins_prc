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

import com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg;
import com.nbp.janaac.application.form.service.service.AddLaboratoryPartOfOrgLocalService;
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
 * Provides the base implementation for the add laboratory part of org local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.janaac.application.form.service.service.impl.AddLaboratoryPartOfOrgLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.janaac.application.form.service.service.impl.AddLaboratoryPartOfOrgLocalServiceImpl
 * @generated
 */
public abstract class AddLaboratoryPartOfOrgLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AddLaboratoryPartOfOrgLocalService, AopService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AddLaboratoryPartOfOrgLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.janaac.application.form.service.service.AddLaboratoryPartOfOrgLocalServiceUtil</code>.
	 */

	/**
	 * Adds the add laboratory part of org to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLaboratoryPartOfOrgLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLaboratoryPartOfOrg the add laboratory part of org
	 * @return the add laboratory part of org that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AddLaboratoryPartOfOrg addAddLaboratoryPartOfOrg(
		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg) {

		addLaboratoryPartOfOrg.setNew(true);

		return addLaboratoryPartOfOrgPersistence.update(addLaboratoryPartOfOrg);
	}

	/**
	 * Creates a new add laboratory part of org with the primary key. Does not add the add laboratory part of org to the database.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key for the new add laboratory part of org
	 * @return the new add laboratory part of org
	 */
	@Override
	@Transactional(enabled = false)
	public AddLaboratoryPartOfOrg createAddLaboratoryPartOfOrg(
		long addLaboratoryPartOfOrgId) {

		return addLaboratoryPartOfOrgPersistence.create(
			addLaboratoryPartOfOrgId);
	}

	/**
	 * Deletes the add laboratory part of org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLaboratoryPartOfOrgLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the add laboratory part of org
	 * @return the add laboratory part of org that was removed
	 * @throws PortalException if a add laboratory part of org with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AddLaboratoryPartOfOrg deleteAddLaboratoryPartOfOrg(
			long addLaboratoryPartOfOrgId)
		throws PortalException {

		return addLaboratoryPartOfOrgPersistence.remove(
			addLaboratoryPartOfOrgId);
	}

	/**
	 * Deletes the add laboratory part of org from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLaboratoryPartOfOrgLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLaboratoryPartOfOrg the add laboratory part of org
	 * @return the add laboratory part of org that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AddLaboratoryPartOfOrg deleteAddLaboratoryPartOfOrg(
		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg) {

		return addLaboratoryPartOfOrgPersistence.remove(addLaboratoryPartOfOrg);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return addLaboratoryPartOfOrgPersistence.dslQuery(dslQuery);
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
			AddLaboratoryPartOfOrg.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return addLaboratoryPartOfOrgPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLaboratoryPartOfOrgModelImpl</code>.
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

		return addLaboratoryPartOfOrgPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLaboratoryPartOfOrgModelImpl</code>.
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

		return addLaboratoryPartOfOrgPersistence.findWithDynamicQuery(
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
		return addLaboratoryPartOfOrgPersistence.countWithDynamicQuery(
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

		return addLaboratoryPartOfOrgPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public AddLaboratoryPartOfOrg fetchAddLaboratoryPartOfOrg(
		long addLaboratoryPartOfOrgId) {

		return addLaboratoryPartOfOrgPersistence.fetchByPrimaryKey(
			addLaboratoryPartOfOrgId);
	}

	/**
	 * Returns the add laboratory part of org with the primary key.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the add laboratory part of org
	 * @return the add laboratory part of org
	 * @throws PortalException if a add laboratory part of org with the primary key could not be found
	 */
	@Override
	public AddLaboratoryPartOfOrg getAddLaboratoryPartOfOrg(
			long addLaboratoryPartOfOrgId)
		throws PortalException {

		return addLaboratoryPartOfOrgPersistence.findByPrimaryKey(
			addLaboratoryPartOfOrgId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			addLaboratoryPartOfOrgLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AddLaboratoryPartOfOrg.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"addLaboratoryPartOfOrgId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			addLaboratoryPartOfOrgLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			AddLaboratoryPartOfOrg.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"addLaboratoryPartOfOrgId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			addLaboratoryPartOfOrgLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AddLaboratoryPartOfOrg.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"addLaboratoryPartOfOrgId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return addLaboratoryPartOfOrgPersistence.create(
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
				"Implement AddLaboratoryPartOfOrgLocalServiceImpl#deleteAddLaboratoryPartOfOrg(AddLaboratoryPartOfOrg) to avoid orphaned data");
		}

		return addLaboratoryPartOfOrgLocalService.deleteAddLaboratoryPartOfOrg(
			(AddLaboratoryPartOfOrg)persistedModel);
	}

	@Override
	public BasePersistence<AddLaboratoryPartOfOrg> getBasePersistence() {
		return addLaboratoryPartOfOrgPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return addLaboratoryPartOfOrgPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the add laboratory part of orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @return the range of add laboratory part of orgs
	 */
	@Override
	public List<AddLaboratoryPartOfOrg> getAddLaboratoryPartOfOrgs(
		int start, int end) {

		return addLaboratoryPartOfOrgPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of add laboratory part of orgs.
	 *
	 * @return the number of add laboratory part of orgs
	 */
	@Override
	public int getAddLaboratoryPartOfOrgsCount() {
		return addLaboratoryPartOfOrgPersistence.countAll();
	}

	/**
	 * Updates the add laboratory part of org in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLaboratoryPartOfOrgLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLaboratoryPartOfOrg the add laboratory part of org
	 * @return the add laboratory part of org that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AddLaboratoryPartOfOrg updateAddLaboratoryPartOfOrg(
		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg) {

		return addLaboratoryPartOfOrgPersistence.update(addLaboratoryPartOfOrg);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AddLaboratoryPartOfOrgLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		addLaboratoryPartOfOrgLocalService =
			(AddLaboratoryPartOfOrgLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AddLaboratoryPartOfOrgLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AddLaboratoryPartOfOrg.class;
	}

	protected String getModelClassName() {
		return AddLaboratoryPartOfOrg.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				addLaboratoryPartOfOrgPersistence.getDataSource();

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

	protected AddLaboratoryPartOfOrgLocalService
		addLaboratoryPartOfOrgLocalService;

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
		AddLaboratoryPartOfOrgLocalServiceBaseImpl.class);

}