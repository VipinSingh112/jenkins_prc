/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddLabMedicalOrganSecLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalOrganSecLocalService
 * @generated
 */
public class AddLabMedicalOrganSecLocalServiceWrapper
	implements AddLabMedicalOrganSecLocalService,
			   ServiceWrapper<AddLabMedicalOrganSecLocalService> {

	public AddLabMedicalOrganSecLocalServiceWrapper() {
		this(null);
	}

	public AddLabMedicalOrganSecLocalServiceWrapper(
		AddLabMedicalOrganSecLocalService addLabMedicalOrganSecLocalService) {

		_addLabMedicalOrganSecLocalService = addLabMedicalOrganSecLocalService;
	}

	/**
	 * Adds the add lab medical organ sec to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalOrganSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalOrganSec the add lab medical organ sec
	 * @return the add lab medical organ sec that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec
		addAddLabMedicalOrganSec(
			com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec
				addLabMedicalOrganSec) {

		return _addLabMedicalOrganSecLocalService.addAddLabMedicalOrganSec(
			addLabMedicalOrganSec);
	}

	/**
	 * Creates a new add lab medical organ sec with the primary key. Does not add the add lab medical organ sec to the database.
	 *
	 * @param addLabMedicalOrganSecId the primary key for the new add lab medical organ sec
	 * @return the new add lab medical organ sec
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec
		createAddLabMedicalOrganSec(long addLabMedicalOrganSecId) {

		return _addLabMedicalOrganSecLocalService.createAddLabMedicalOrganSec(
			addLabMedicalOrganSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalOrganSecLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add lab medical organ sec from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalOrganSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalOrganSec the add lab medical organ sec
	 * @return the add lab medical organ sec that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec
		deleteAddLabMedicalOrganSec(
			com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec
				addLabMedicalOrganSec) {

		return _addLabMedicalOrganSecLocalService.deleteAddLabMedicalOrganSec(
			addLabMedicalOrganSec);
	}

	/**
	 * Deletes the add lab medical organ sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalOrganSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalOrganSecId the primary key of the add lab medical organ sec
	 * @return the add lab medical organ sec that was removed
	 * @throws PortalException if a add lab medical organ sec with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec
			deleteAddLabMedicalOrganSec(long addLabMedicalOrganSecId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalOrganSecLocalService.deleteAddLabMedicalOrganSec(
			addLabMedicalOrganSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalOrganSecLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addLabMedicalOrganSecLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addLabMedicalOrganSecLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addLabMedicalOrganSecLocalService.dynamicQuery();
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

		return _addLabMedicalOrganSecLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganSecModelImpl</code>.
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

		return _addLabMedicalOrganSecLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganSecModelImpl</code>.
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

		return _addLabMedicalOrganSecLocalService.dynamicQuery(
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

		return _addLabMedicalOrganSecLocalService.dynamicQueryCount(
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

		return _addLabMedicalOrganSecLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec
		fetchAddLabMedicalOrganSec(long addLabMedicalOrganSecId) {

		return _addLabMedicalOrganSecLocalService.fetchAddLabMedicalOrganSec(
			addLabMedicalOrganSecId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addLabMedicalOrganSecLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab medical organ sec with the primary key.
	 *
	 * @param addLabMedicalOrganSecId the primary key of the add lab medical organ sec
	 * @return the add lab medical organ sec
	 * @throws PortalException if a add lab medical organ sec with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec
			getAddLabMedicalOrganSec(long addLabMedicalOrganSecId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalOrganSecLocalService.getAddLabMedicalOrganSec(
			addLabMedicalOrganSecId);
	}

	/**
	 * Returns a range of all the add lab medical organ secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ secs
	 * @param end the upper bound of the range of add lab medical organ secs (not inclusive)
	 * @return the range of add lab medical organ secs
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec>
			getAddLabMedicalOrganSecs(int start, int end) {

		return _addLabMedicalOrganSecLocalService.getAddLabMedicalOrganSecs(
			start, end);
	}

	/**
	 * Returns the number of add lab medical organ secs.
	 *
	 * @return the number of add lab medical organ secs
	 */
	@Override
	public int getAddLabMedicalOrganSecsCount() {
		return _addLabMedicalOrganSecLocalService.
			getAddLabMedicalOrganSecsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addLabMedicalOrganSecLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec>
			getJanaacById(long janaacApplicationId) {

		return _addLabMedicalOrganSecLocalService.getJanaacById(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabMedicalOrganSecLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalOrganSecLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add lab medical organ sec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalOrganSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalOrganSec the add lab medical organ sec
	 * @return the add lab medical organ sec that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec
		updateAddLabMedicalOrganSec(
			com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec
				addLabMedicalOrganSec) {

		return _addLabMedicalOrganSecLocalService.updateAddLabMedicalOrganSec(
			addLabMedicalOrganSec);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addLabMedicalOrganSecLocalService.getBasePersistence();
	}

	@Override
	public AddLabMedicalOrganSecLocalService getWrappedService() {
		return _addLabMedicalOrganSecLocalService;
	}

	@Override
	public void setWrappedService(
		AddLabMedicalOrganSecLocalService addLabMedicalOrganSecLocalService) {

		_addLabMedicalOrganSecLocalService = addLabMedicalOrganSecLocalService;
	}

	private AddLabMedicalOrganSecLocalService
		_addLabMedicalOrganSecLocalService;

}