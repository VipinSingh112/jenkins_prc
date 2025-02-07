/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchNotifiLegalInfoException;
import com.nbp.hsra.application.service.model.NotifiLegalInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the notifi legal info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NotifiLegalInfoUtil
 * @generated
 */
@ProviderType
public interface NotifiLegalInfoPersistence
	extends BasePersistence<NotifiLegalInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NotifiLegalInfoUtil} to access the notifi legal info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the notifi legal info where hsraApplicationId = &#63; or throws a <code>NoSuchNotifiLegalInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching notifi legal info
	 * @throws NoSuchNotifiLegalInfoException if a matching notifi legal info could not be found
	 */
	public NotifiLegalInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchNotifiLegalInfoException;

	/**
	 * Returns the notifi legal info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching notifi legal info, or <code>null</code> if a matching notifi legal info could not be found
	 */
	public NotifiLegalInfo fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the notifi legal info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching notifi legal info, or <code>null</code> if a matching notifi legal info could not be found
	 */
	public NotifiLegalInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the notifi legal info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the notifi legal info that was removed
	 */
	public NotifiLegalInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchNotifiLegalInfoException;

	/**
	 * Returns the number of notifi legal infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching notifi legal infos
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the notifi legal info in the entity cache if it is enabled.
	 *
	 * @param notifiLegalInfo the notifi legal info
	 */
	public void cacheResult(NotifiLegalInfo notifiLegalInfo);

	/**
	 * Caches the notifi legal infos in the entity cache if it is enabled.
	 *
	 * @param notifiLegalInfos the notifi legal infos
	 */
	public void cacheResult(java.util.List<NotifiLegalInfo> notifiLegalInfos);

	/**
	 * Creates a new notifi legal info with the primary key. Does not add the notifi legal info to the database.
	 *
	 * @param notifiLegalInfoId the primary key for the new notifi legal info
	 * @return the new notifi legal info
	 */
	public NotifiLegalInfo create(long notifiLegalInfoId);

	/**
	 * Removes the notifi legal info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param notifiLegalInfoId the primary key of the notifi legal info
	 * @return the notifi legal info that was removed
	 * @throws NoSuchNotifiLegalInfoException if a notifi legal info with the primary key could not be found
	 */
	public NotifiLegalInfo remove(long notifiLegalInfoId)
		throws NoSuchNotifiLegalInfoException;

	public NotifiLegalInfo updateImpl(NotifiLegalInfo notifiLegalInfo);

	/**
	 * Returns the notifi legal info with the primary key or throws a <code>NoSuchNotifiLegalInfoException</code> if it could not be found.
	 *
	 * @param notifiLegalInfoId the primary key of the notifi legal info
	 * @return the notifi legal info
	 * @throws NoSuchNotifiLegalInfoException if a notifi legal info with the primary key could not be found
	 */
	public NotifiLegalInfo findByPrimaryKey(long notifiLegalInfoId)
		throws NoSuchNotifiLegalInfoException;

	/**
	 * Returns the notifi legal info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param notifiLegalInfoId the primary key of the notifi legal info
	 * @return the notifi legal info, or <code>null</code> if a notifi legal info with the primary key could not be found
	 */
	public NotifiLegalInfo fetchByPrimaryKey(long notifiLegalInfoId);

	/**
	 * Returns all the notifi legal infos.
	 *
	 * @return the notifi legal infos
	 */
	public java.util.List<NotifiLegalInfo> findAll();

	/**
	 * Returns a range of all the notifi legal infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotifiLegalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of notifi legal infos
	 * @param end the upper bound of the range of notifi legal infos (not inclusive)
	 * @return the range of notifi legal infos
	 */
	public java.util.List<NotifiLegalInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the notifi legal infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotifiLegalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of notifi legal infos
	 * @param end the upper bound of the range of notifi legal infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of notifi legal infos
	 */
	public java.util.List<NotifiLegalInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NotifiLegalInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the notifi legal infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotifiLegalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of notifi legal infos
	 * @param end the upper bound of the range of notifi legal infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of notifi legal infos
	 */
	public java.util.List<NotifiLegalInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NotifiLegalInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the notifi legal infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of notifi legal infos.
	 *
	 * @return the number of notifi legal infos
	 */
	public int countAll();

}