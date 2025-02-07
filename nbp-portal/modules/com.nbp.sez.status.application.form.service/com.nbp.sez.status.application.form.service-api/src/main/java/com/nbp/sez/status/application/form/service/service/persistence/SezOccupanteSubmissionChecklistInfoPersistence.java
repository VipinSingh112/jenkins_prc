/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupanteSubmissionChecklistInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupanteSubmissionChecklistInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez occupante submission checklist info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupanteSubmissionChecklistInfoUtil
 * @generated
 */
@ProviderType
public interface SezOccupanteSubmissionChecklistInfoPersistence
	extends BasePersistence<SezOccupanteSubmissionChecklistInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezOccupanteSubmissionChecklistInfoUtil} to access the sez occupante submission checklist info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez occupante submission checklist info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupanteSubmissionChecklistInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupante submission checklist info
	 * @throws NoSuchSezOccupanteSubmissionChecklistInfoException if a matching sez occupante submission checklist info could not be found
	 */
	public SezOccupanteSubmissionChecklistInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupanteSubmissionChecklistInfoException;

	/**
	 * Returns the sez occupante submission checklist info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupante submission checklist info, or <code>null</code> if a matching sez occupante submission checklist info could not be found
	 */
	public SezOccupanteSubmissionChecklistInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez occupante submission checklist info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupante submission checklist info, or <code>null</code> if a matching sez occupante submission checklist info could not be found
	 */
	public SezOccupanteSubmissionChecklistInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez occupante submission checklist info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupante submission checklist info that was removed
	 */
	public SezOccupanteSubmissionChecklistInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupanteSubmissionChecklistInfoException;

	/**
	 * Returns the number of sez occupante submission checklist infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupante submission checklist infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez occupante submission checklist info in the entity cache if it is enabled.
	 *
	 * @param sezOccupanteSubmissionChecklistInfo the sez occupante submission checklist info
	 */
	public void cacheResult(
		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo);

	/**
	 * Caches the sez occupante submission checklist infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupanteSubmissionChecklistInfos the sez occupante submission checklist infos
	 */
	public void cacheResult(
		java.util.List<SezOccupanteSubmissionChecklistInfo>
			sezOccupanteSubmissionChecklistInfos);

	/**
	 * Creates a new sez occupante submission checklist info with the primary key. Does not add the sez occupante submission checklist info to the database.
	 *
	 * @param sezOccCheckSubmitId the primary key for the new sez occupante submission checklist info
	 * @return the new sez occupante submission checklist info
	 */
	public SezOccupanteSubmissionChecklistInfo create(long sezOccCheckSubmitId);

	/**
	 * Removes the sez occupante submission checklist info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccCheckSubmitId the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info that was removed
	 * @throws NoSuchSezOccupanteSubmissionChecklistInfoException if a sez occupante submission checklist info with the primary key could not be found
	 */
	public SezOccupanteSubmissionChecklistInfo remove(long sezOccCheckSubmitId)
		throws NoSuchSezOccupanteSubmissionChecklistInfoException;

	public SezOccupanteSubmissionChecklistInfo updateImpl(
		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo);

	/**
	 * Returns the sez occupante submission checklist info with the primary key or throws a <code>NoSuchSezOccupanteSubmissionChecklistInfoException</code> if it could not be found.
	 *
	 * @param sezOccCheckSubmitId the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info
	 * @throws NoSuchSezOccupanteSubmissionChecklistInfoException if a sez occupante submission checklist info with the primary key could not be found
	 */
	public SezOccupanteSubmissionChecklistInfo findByPrimaryKey(
			long sezOccCheckSubmitId)
		throws NoSuchSezOccupanteSubmissionChecklistInfoException;

	/**
	 * Returns the sez occupante submission checklist info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccCheckSubmitId the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info, or <code>null</code> if a sez occupante submission checklist info with the primary key could not be found
	 */
	public SezOccupanteSubmissionChecklistInfo fetchByPrimaryKey(
		long sezOccCheckSubmitId);

	/**
	 * Returns all the sez occupante submission checklist infos.
	 *
	 * @return the sez occupante submission checklist infos
	 */
	public java.util.List<SezOccupanteSubmissionChecklistInfo> findAll();

	/**
	 * Returns a range of all the sez occupante submission checklist infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteSubmissionChecklistInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante submission checklist infos
	 * @param end the upper bound of the range of sez occupante submission checklist infos (not inclusive)
	 * @return the range of sez occupante submission checklist infos
	 */
	public java.util.List<SezOccupanteSubmissionChecklistInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez occupante submission checklist infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteSubmissionChecklistInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante submission checklist infos
	 * @param end the upper bound of the range of sez occupante submission checklist infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupante submission checklist infos
	 */
	public java.util.List<SezOccupanteSubmissionChecklistInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupanteSubmissionChecklistInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the sez occupante submission checklist infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteSubmissionChecklistInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante submission checklist infos
	 * @param end the upper bound of the range of sez occupante submission checklist infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupante submission checklist infos
	 */
	public java.util.List<SezOccupanteSubmissionChecklistInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupanteSubmissionChecklistInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez occupante submission checklist infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez occupante submission checklist infos.
	 *
	 * @return the number of sez occupante submission checklist infos
	 */
	public int countAll();

}