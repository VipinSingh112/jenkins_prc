/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddInsOrgInfoSecondLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoSecondLocalService
 * @generated
 */
public class AddInsOrgInfoSecondLocalServiceWrapper
	implements AddInsOrgInfoSecondLocalService,
			   ServiceWrapper<AddInsOrgInfoSecondLocalService> {

	public AddInsOrgInfoSecondLocalServiceWrapper() {
		this(null);
	}

	public AddInsOrgInfoSecondLocalServiceWrapper(
		AddInsOrgInfoSecondLocalService addInsOrgInfoSecondLocalService) {

		_addInsOrgInfoSecondLocalService = addInsOrgInfoSecondLocalService;
	}

	/**
	 * Adds the add ins org info second to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsOrgInfoSecond the add ins org info second
	 * @return the add ins org info second that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond
		addAddInsOrgInfoSecond(
			com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond
				addInsOrgInfoSecond) {

		return _addInsOrgInfoSecondLocalService.addAddInsOrgInfoSecond(
			addInsOrgInfoSecond);
	}

	/**
	 * Creates a new add ins org info second with the primary key. Does not add the add ins org info second to the database.
	 *
	 * @param addInsOrgInfoSecondId the primary key for the new add ins org info second
	 * @return the new add ins org info second
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond
		createAddInsOrgInfoSecond(long addInsOrgInfoSecondId) {

		return _addInsOrgInfoSecondLocalService.createAddInsOrgInfoSecond(
			addInsOrgInfoSecondId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoSecondLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add ins org info second from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsOrgInfoSecond the add ins org info second
	 * @return the add ins org info second that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond
		deleteAddInsOrgInfoSecond(
			com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond
				addInsOrgInfoSecond) {

		return _addInsOrgInfoSecondLocalService.deleteAddInsOrgInfoSecond(
			addInsOrgInfoSecond);
	}

	/**
	 * Deletes the add ins org info second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsOrgInfoSecondId the primary key of the add ins org info second
	 * @return the add ins org info second that was removed
	 * @throws PortalException if a add ins org info second with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond
			deleteAddInsOrgInfoSecond(long addInsOrgInfoSecondId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoSecondLocalService.deleteAddInsOrgInfoSecond(
			addInsOrgInfoSecondId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoSecondLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addInsOrgInfoSecondLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addInsOrgInfoSecondLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addInsOrgInfoSecondLocalService.dynamicQuery();
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

		return _addInsOrgInfoSecondLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoSecondModelImpl</code>.
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

		return _addInsOrgInfoSecondLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoSecondModelImpl</code>.
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

		return _addInsOrgInfoSecondLocalService.dynamicQuery(
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

		return _addInsOrgInfoSecondLocalService.dynamicQueryCount(dynamicQuery);
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

		return _addInsOrgInfoSecondLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond
		fetchAddInsOrgInfoSecond(long addInsOrgInfoSecondId) {

		return _addInsOrgInfoSecondLocalService.fetchAddInsOrgInfoSecond(
			addInsOrgInfoSecondId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addInsOrgInfoSecondLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add ins org info second with the primary key.
	 *
	 * @param addInsOrgInfoSecondId the primary key of the add ins org info second
	 * @return the add ins org info second
	 * @throws PortalException if a add ins org info second with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond
			getAddInsOrgInfoSecond(long addInsOrgInfoSecondId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoSecondLocalService.getAddInsOrgInfoSecond(
			addInsOrgInfoSecondId);
	}

	/**
	 * Returns a range of all the add ins org info seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @return the range of add ins org info seconds
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond>
			getAddInsOrgInfoSeconds(int start, int end) {

		return _addInsOrgInfoSecondLocalService.getAddInsOrgInfoSeconds(
			start, end);
	}

	/**
	 * Returns the number of add ins org info seconds.
	 *
	 * @return the number of add ins org info seconds
	 */
	@Override
	public int getAddInsOrgInfoSecondsCount() {
		return _addInsOrgInfoSecondLocalService.getAddInsOrgInfoSecondsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addInsOrgInfoSecondLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addInsOrgInfoSecondLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addInsOrgInfoSecondLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoSecondLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add ins org info second in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsOrgInfoSecond the add ins org info second
	 * @return the add ins org info second that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond
		updateAddInsOrgInfoSecond(
			com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond
				addInsOrgInfoSecond) {

		return _addInsOrgInfoSecondLocalService.updateAddInsOrgInfoSecond(
			addInsOrgInfoSecond);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addInsOrgInfoSecondLocalService.getBasePersistence();
	}

	@Override
	public AddInsOrgInfoSecondLocalService getWrappedService() {
		return _addInsOrgInfoSecondLocalService;
	}

	@Override
	public void setWrappedService(
		AddInsOrgInfoSecondLocalService addInsOrgInfoSecondLocalService) {

		_addInsOrgInfoSecondLocalService = addInsOrgInfoSecondLocalService;
	}

	private AddInsOrgInfoSecondLocalService _addInsOrgInfoSecondLocalService;

}