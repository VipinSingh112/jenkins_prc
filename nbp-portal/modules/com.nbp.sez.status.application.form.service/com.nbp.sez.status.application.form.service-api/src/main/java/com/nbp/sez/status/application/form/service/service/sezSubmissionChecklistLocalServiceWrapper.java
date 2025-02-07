/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link sezSubmissionChecklistLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see sezSubmissionChecklistLocalService
 * @generated
 */
public class sezSubmissionChecklistLocalServiceWrapper
	implements ServiceWrapper<sezSubmissionChecklistLocalService>,
			   sezSubmissionChecklistLocalService {

	public sezSubmissionChecklistLocalServiceWrapper() {
		this(null);
	}

	public sezSubmissionChecklistLocalServiceWrapper(
		sezSubmissionChecklistLocalService sezSubmissionChecklistLocalService) {

		_sezSubmissionChecklistLocalService =
			sezSubmissionChecklistLocalService;
	}

	/**
	 * Adds the sez submission checklist to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect sezSubmissionChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezSubmissionChecklist the sez submission checklist
	 * @return the sez submission checklist that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist
			addsezSubmissionChecklist(
				com.nbp.sez.status.application.form.service.model.
					sezSubmissionChecklist sezSubmissionChecklist) {

		return _sezSubmissionChecklistLocalService.addsezSubmissionChecklist(
			sezSubmissionChecklist);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezSubmissionChecklistLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez submission checklist with the primary key. Does not add the sez submission checklist to the database.
	 *
	 * @param sezSubmissionChecklistId the primary key for the new sez submission checklist
	 * @return the new sez submission checklist
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist
			createsezSubmissionChecklist(long sezSubmissionChecklistId) {

		return _sezSubmissionChecklistLocalService.createsezSubmissionChecklist(
			sezSubmissionChecklistId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezSubmissionChecklistLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez submission checklist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect sezSubmissionChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezSubmissionChecklistId the primary key of the sez submission checklist
	 * @return the sez submission checklist that was removed
	 * @throws PortalException if a sez submission checklist with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist
				deletesezSubmissionChecklist(long sezSubmissionChecklistId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezSubmissionChecklistLocalService.deletesezSubmissionChecklist(
			sezSubmissionChecklistId);
	}

	/**
	 * Deletes the sez submission checklist from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect sezSubmissionChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezSubmissionChecklist the sez submission checklist
	 * @return the sez submission checklist that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist
			deletesezSubmissionChecklist(
				com.nbp.sez.status.application.form.service.model.
					sezSubmissionChecklist sezSubmissionChecklist) {

		return _sezSubmissionChecklistLocalService.deletesezSubmissionChecklist(
			sezSubmissionChecklist);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezSubmissionChecklistLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezSubmissionChecklistLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezSubmissionChecklistLocalService.dynamicQuery();
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

		return _sezSubmissionChecklistLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.sezSubmissionChecklistModelImpl</code>.
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

		return _sezSubmissionChecklistLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.sezSubmissionChecklistModelImpl</code>.
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

		return _sezSubmissionChecklistLocalService.dynamicQuery(
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

		return _sezSubmissionChecklistLocalService.dynamicQueryCount(
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

		return _sezSubmissionChecklistLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist
			fetchsezSubmissionChecklist(long sezSubmissionChecklistId) {

		return _sezSubmissionChecklistLocalService.fetchsezSubmissionChecklist(
			sezSubmissionChecklistId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezSubmissionChecklistLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezSubmissionChecklistLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezSubmissionChecklistLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezSubmissionChecklistLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist
				getSezById(long sezStatusApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchsezSubmissionChecklistException {

		return _sezSubmissionChecklistLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez submission checklist with the primary key.
	 *
	 * @param sezSubmissionChecklistId the primary key of the sez submission checklist
	 * @return the sez submission checklist
	 * @throws PortalException if a sez submission checklist with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist
				getsezSubmissionChecklist(long sezSubmissionChecklistId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezSubmissionChecklistLocalService.getsezSubmissionChecklist(
			sezSubmissionChecklistId);
	}

	/**
	 * Returns a range of all the sez submission checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.sezSubmissionChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez submission checklists
	 * @param end the upper bound of the range of sez submission checklists (not inclusive)
	 * @return the range of sez submission checklists
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			sezSubmissionChecklist> getsezSubmissionChecklists(
				int start, int end) {

		return _sezSubmissionChecklistLocalService.getsezSubmissionChecklists(
			start, end);
	}

	/**
	 * Returns the number of sez submission checklists.
	 *
	 * @return the number of sez submission checklists
	 */
	@Override
	public int getsezSubmissionChecklistsCount() {
		return _sezSubmissionChecklistLocalService.
			getsezSubmissionChecklistsCount();
	}

	/**
	 * Updates the sez submission checklist in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect sezSubmissionChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezSubmissionChecklist the sez submission checklist
	 * @return the sez submission checklist that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist
			updatesezSubmissionChecklist(
				com.nbp.sez.status.application.form.service.model.
					sezSubmissionChecklist sezSubmissionChecklist) {

		return _sezSubmissionChecklistLocalService.updatesezSubmissionChecklist(
			sezSubmissionChecklist);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezSubmissionChecklistLocalService.getBasePersistence();
	}

	@Override
	public sezSubmissionChecklistLocalService getWrappedService() {
		return _sezSubmissionChecklistLocalService;
	}

	@Override
	public void setWrappedService(
		sezSubmissionChecklistLocalService sezSubmissionChecklistLocalService) {

		_sezSubmissionChecklistLocalService =
			sezSubmissionChecklistLocalService;
	}

	private sezSubmissionChecklistLocalService
		_sezSubmissionChecklistLocalService;

}