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

import com.nbp.janaac.application.form.service.model.AddLabAppliInfo;
import com.nbp.janaac.application.form.service.service.AddLabAppliInfoLocalService;
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
 * Provides the base implementation for the add lab appli info local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.janaac.application.form.service.service.impl.AddLabAppliInfoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.janaac.application.form.service.service.impl.AddLabAppliInfoLocalServiceImpl
 * @generated
 */
public abstract class AddLabAppliInfoLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AddLabAppliInfoLocalService, AopService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AddLabAppliInfoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.janaac.application.form.service.service.AddLabAppliInfoLocalServiceUtil</code>.
	 */

	/**
	 * Adds the add lab appli info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabAppliInfo the add lab appli info
	 * @return the add lab appli info that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AddLabAppliInfo addAddLabAppliInfo(AddLabAppliInfo addLabAppliInfo) {
		addLabAppliInfo.setNew(true);

		return addLabAppliInfoPersistence.update(addLabAppliInfo);
	}

	/**
	 * Creates a new add lab appli info with the primary key. Does not add the add lab appli info to the database.
	 *
	 * @param addLabAppliInfoId the primary key for the new add lab appli info
	 * @return the new add lab appli info
	 */
	@Override
	@Transactional(enabled = false)
	public AddLabAppliInfo createAddLabAppliInfo(long addLabAppliInfoId) {
		return addLabAppliInfoPersistence.create(addLabAppliInfoId);
	}

	/**
	 * Deletes the add lab appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabAppliInfoId the primary key of the add lab appli info
	 * @return the add lab appli info that was removed
	 * @throws PortalException if a add lab appli info with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AddLabAppliInfo deleteAddLabAppliInfo(long addLabAppliInfoId)
		throws PortalException {

		return addLabAppliInfoPersistence.remove(addLabAppliInfoId);
	}

	/**
	 * Deletes the add lab appli info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabAppliInfo the add lab appli info
	 * @return the add lab appli info that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AddLabAppliInfo deleteAddLabAppliInfo(
		AddLabAppliInfo addLabAppliInfo) {

		return addLabAppliInfoPersistence.remove(addLabAppliInfo);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return addLabAppliInfoPersistence.dslQuery(dslQuery);
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
			AddLabAppliInfo.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return addLabAppliInfoPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabAppliInfoModelImpl</code>.
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

		return addLabAppliInfoPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabAppliInfoModelImpl</code>.
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

		return addLabAppliInfoPersistence.findWithDynamicQuery(
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
		return addLabAppliInfoPersistence.countWithDynamicQuery(dynamicQuery);
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

		return addLabAppliInfoPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public AddLabAppliInfo fetchAddLabAppliInfo(long addLabAppliInfoId) {
		return addLabAppliInfoPersistence.fetchByPrimaryKey(addLabAppliInfoId);
	}

	/**
	 * Returns the add lab appli info with the primary key.
	 *
	 * @param addLabAppliInfoId the primary key of the add lab appli info
	 * @return the add lab appli info
	 * @throws PortalException if a add lab appli info with the primary key could not be found
	 */
	@Override
	public AddLabAppliInfo getAddLabAppliInfo(long addLabAppliInfoId)
		throws PortalException {

		return addLabAppliInfoPersistence.findByPrimaryKey(addLabAppliInfoId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(addLabAppliInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AddLabAppliInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("addLabAppliInfoId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			addLabAppliInfoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(AddLabAppliInfo.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"addLabAppliInfoId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(addLabAppliInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AddLabAppliInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("addLabAppliInfoId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return addLabAppliInfoPersistence.create(
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
				"Implement AddLabAppliInfoLocalServiceImpl#deleteAddLabAppliInfo(AddLabAppliInfo) to avoid orphaned data");
		}

		return addLabAppliInfoLocalService.deleteAddLabAppliInfo(
			(AddLabAppliInfo)persistedModel);
	}

	@Override
	public BasePersistence<AddLabAppliInfo> getBasePersistence() {
		return addLabAppliInfoPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return addLabAppliInfoPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the add lab appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @return the range of add lab appli infos
	 */
	@Override
	public List<AddLabAppliInfo> getAddLabAppliInfos(int start, int end) {
		return addLabAppliInfoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of add lab appli infos.
	 *
	 * @return the number of add lab appli infos
	 */
	@Override
	public int getAddLabAppliInfosCount() {
		return addLabAppliInfoPersistence.countAll();
	}

	/**
	 * Updates the add lab appli info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabAppliInfo the add lab appli info
	 * @return the add lab appli info that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AddLabAppliInfo updateAddLabAppliInfo(
		AddLabAppliInfo addLabAppliInfo) {

		return addLabAppliInfoPersistence.update(addLabAppliInfo);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AddLabAppliInfoLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		addLabAppliInfoLocalService = (AddLabAppliInfoLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AddLabAppliInfoLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AddLabAppliInfo.class;
	}

	protected String getModelClassName() {
		return AddLabAppliInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = addLabAppliInfoPersistence.getDataSource();

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

	protected AddLabAppliInfoLocalService addLabAppliInfoLocalService;

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
		AddLabAppliInfoLocalServiceBaseImpl.class);

}