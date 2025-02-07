/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractionWaterEmployeeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterEmployeeLocalService
 * @generated
 */
public class AttractionWaterEmployeeLocalServiceWrapper
	implements AttractionWaterEmployeeLocalService,
			   ServiceWrapper<AttractionWaterEmployeeLocalService> {

	public AttractionWaterEmployeeLocalServiceWrapper() {
		this(null);
	}

	public AttractionWaterEmployeeLocalServiceWrapper(
		AttractionWaterEmployeeLocalService
			attractionWaterEmployeeLocalService) {

		_attractionWaterEmployeeLocalService =
			attractionWaterEmployeeLocalService;
	}

	/**
	 * Adds the attraction water employee to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterEmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterEmployee the attraction water employee
	 * @return the attraction water employee that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterEmployee
		addAttractionWaterEmployee(
			com.nbp.jtb.application.form.service.model.AttractionWaterEmployee
				attractionWaterEmployee) {

		return _attractionWaterEmployeeLocalService.addAttractionWaterEmployee(
			attractionWaterEmployee);
	}

	/**
	 * Creates a new attraction water employee with the primary key. Does not add the attraction water employee to the database.
	 *
	 * @param attractionWaterEmpLicId the primary key for the new attraction water employee
	 * @return the new attraction water employee
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterEmployee
		createAttractionWaterEmployee(long attractionWaterEmpLicId) {

		return _attractionWaterEmployeeLocalService.
			createAttractionWaterEmployee(attractionWaterEmpLicId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterEmployeeLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attraction water employee from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterEmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterEmployee the attraction water employee
	 * @return the attraction water employee that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterEmployee
		deleteAttractionWaterEmployee(
			com.nbp.jtb.application.form.service.model.AttractionWaterEmployee
				attractionWaterEmployee) {

		return _attractionWaterEmployeeLocalService.
			deleteAttractionWaterEmployee(attractionWaterEmployee);
	}

	/**
	 * Deletes the attraction water employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterEmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterEmpLicId the primary key of the attraction water employee
	 * @return the attraction water employee that was removed
	 * @throws PortalException if a attraction water employee with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterEmployee
			deleteAttractionWaterEmployee(long attractionWaterEmpLicId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterEmployeeLocalService.
			deleteAttractionWaterEmployee(attractionWaterEmpLicId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterEmployeeLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionWaterEmployeeLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionWaterEmployeeLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionWaterEmployeeLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _attractionWaterEmployeeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionWaterEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _attractionWaterEmployeeLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionWaterEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _attractionWaterEmployeeLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _attractionWaterEmployeeLocalService.dynamicQueryCount(
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
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _attractionWaterEmployeeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterEmployee
		fetchAttractionWaterEmployee(long attractionWaterEmpLicId) {

		return _attractionWaterEmployeeLocalService.
			fetchAttractionWaterEmployee(attractionWaterEmpLicId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionWaterEmployeeLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction water employee with the primary key.
	 *
	 * @param attractionWaterEmpLicId the primary key of the attraction water employee
	 * @return the attraction water employee
	 * @throws PortalException if a attraction water employee with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterEmployee
			getAttractionWaterEmployee(long attractionWaterEmpLicId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterEmployeeLocalService.getAttractionWaterEmployee(
			attractionWaterEmpLicId);
	}

	/**
	 * Returns a range of all the attraction water employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionWaterEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water employees
	 * @param end the upper bound of the range of attraction water employees (not inclusive)
	 * @return the range of attraction water employees
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionWaterEmployee>
			getAttractionWaterEmployees(int start, int end) {

		return _attractionWaterEmployeeLocalService.getAttractionWaterEmployees(
			start, end);
	}

	/**
	 * Returns the number of attraction water employees.
	 *
	 * @return the number of attraction water employees
	 */
	@Override
	public int getAttractionWaterEmployeesCount() {
		return _attractionWaterEmployeeLocalService.
			getAttractionWaterEmployeesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionWaterEmployeeLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterEmployee
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterEmployeeException {

		return _attractionWaterEmployeeLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionWaterEmployeeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterEmployeeLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attraction water employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterEmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterEmployee the attraction water employee
	 * @return the attraction water employee that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterEmployee
		updateAttractionWaterEmployee(
			com.nbp.jtb.application.form.service.model.AttractionWaterEmployee
				attractionWaterEmployee) {

		return _attractionWaterEmployeeLocalService.
			updateAttractionWaterEmployee(attractionWaterEmployee);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractionWaterEmployeeLocalService.getBasePersistence();
	}

	@Override
	public AttractionWaterEmployeeLocalService getWrappedService() {
		return _attractionWaterEmployeeLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionWaterEmployeeLocalService
			attractionWaterEmployeeLocalService) {

		_attractionWaterEmployeeLocalService =
			attractionWaterEmployeeLocalService;
	}

	private AttractionWaterEmployeeLocalService
		_attractionWaterEmployeeLocalService;

}