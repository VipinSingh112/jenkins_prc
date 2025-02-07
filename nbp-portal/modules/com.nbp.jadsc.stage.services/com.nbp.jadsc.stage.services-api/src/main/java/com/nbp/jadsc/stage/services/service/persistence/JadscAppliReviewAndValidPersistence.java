/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.stage.services.exception.NoSuchJadscAppliReviewAndValidException;
import com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc appli review and valid service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliReviewAndValidUtil
 * @generated
 */
@ProviderType
public interface JadscAppliReviewAndValidPersistence
	extends BasePersistence<JadscAppliReviewAndValid> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JadscAppliReviewAndValidUtil} to access the jadsc appli review and valid persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the jadsc appli review and valid where caseId = &#63; or throws a <code>NoSuchJadscAppliReviewAndValidException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a matching jadsc appli review and valid could not be found
	 */
	public JadscAppliReviewAndValid findBygetJadsc_RV_CI(String caseId)
		throws NoSuchJadscAppliReviewAndValidException;

	/**
	 * Returns the jadsc appli review and valid where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli review and valid, or <code>null</code> if a matching jadsc appli review and valid could not be found
	 */
	public JadscAppliReviewAndValid fetchBygetJadsc_RV_CI(String caseId);

	/**
	 * Returns the jadsc appli review and valid where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc appli review and valid, or <code>null</code> if a matching jadsc appli review and valid could not be found
	 */
	public JadscAppliReviewAndValid fetchBygetJadsc_RV_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the jadsc appli review and valid where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc appli review and valid that was removed
	 */
	public JadscAppliReviewAndValid removeBygetJadsc_RV_CI(String caseId)
		throws NoSuchJadscAppliReviewAndValidException;

	/**
	 * Returns the number of jadsc appli review and valids where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc appli review and valids
	 */
	public int countBygetJadsc_RV_CI(String caseId);

	/**
	 * Returns all the jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @return the matching jadsc appli review and valids
	 */
	public java.util.List<JadscAppliReviewAndValid> findBygetJadsc_By_RV(
		String versionOfApplication);

	/**
	 * Returns a range of all the jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param versionOfApplication the version of application
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @return the range of matching jadsc appli review and valids
	 */
	public java.util.List<JadscAppliReviewAndValid> findBygetJadsc_By_RV(
		String versionOfApplication, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param versionOfApplication the version of application
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc appli review and valids
	 */
	public java.util.List<JadscAppliReviewAndValid> findBygetJadsc_By_RV(
		String versionOfApplication, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliReviewAndValid> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param versionOfApplication the version of application
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc appli review and valids
	 */
	public java.util.List<JadscAppliReviewAndValid> findBygetJadsc_By_RV(
		String versionOfApplication, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliReviewAndValid> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a matching jadsc appli review and valid could not be found
	 */
	public JadscAppliReviewAndValid findBygetJadsc_By_RV_First(
			String versionOfApplication,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscAppliReviewAndValid> orderByComparator)
		throws NoSuchJadscAppliReviewAndValidException;

	/**
	 * Returns the first jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli review and valid, or <code>null</code> if a matching jadsc appli review and valid could not be found
	 */
	public JadscAppliReviewAndValid fetchBygetJadsc_By_RV_First(
		String versionOfApplication,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliReviewAndValid> orderByComparator);

	/**
	 * Returns the last jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a matching jadsc appli review and valid could not be found
	 */
	public JadscAppliReviewAndValid findBygetJadsc_By_RV_Last(
			String versionOfApplication,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscAppliReviewAndValid> orderByComparator)
		throws NoSuchJadscAppliReviewAndValidException;

	/**
	 * Returns the last jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli review and valid, or <code>null</code> if a matching jadsc appli review and valid could not be found
	 */
	public JadscAppliReviewAndValid fetchBygetJadsc_By_RV_Last(
		String versionOfApplication,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliReviewAndValid> orderByComparator);

	/**
	 * Returns the jadsc appli review and valids before and after the current jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the current jadsc appli review and valid
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a jadsc appli review and valid with the primary key could not be found
	 */
	public JadscAppliReviewAndValid[] findBygetJadsc_By_RV_PrevAndNext(
			long jadscAppliReviewAndValidId, String versionOfApplication,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscAppliReviewAndValid> orderByComparator)
		throws NoSuchJadscAppliReviewAndValidException;

	/**
	 * Removes all the jadsc appli review and valids where versionOfApplication = &#63; from the database.
	 *
	 * @param versionOfApplication the version of application
	 */
	public void removeBygetJadsc_By_RV(String versionOfApplication);

	/**
	 * Returns the number of jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @return the number of matching jadsc appli review and valids
	 */
	public int countBygetJadsc_By_RV(String versionOfApplication);

	/**
	 * Caches the jadsc appli review and valid in the entity cache if it is enabled.
	 *
	 * @param jadscAppliReviewAndValid the jadsc appli review and valid
	 */
	public void cacheResult(JadscAppliReviewAndValid jadscAppliReviewAndValid);

	/**
	 * Caches the jadsc appli review and valids in the entity cache if it is enabled.
	 *
	 * @param jadscAppliReviewAndValids the jadsc appli review and valids
	 */
	public void cacheResult(
		java.util.List<JadscAppliReviewAndValid> jadscAppliReviewAndValids);

	/**
	 * Creates a new jadsc appli review and valid with the primary key. Does not add the jadsc appli review and valid to the database.
	 *
	 * @param jadscAppliReviewAndValidId the primary key for the new jadsc appli review and valid
	 * @return the new jadsc appli review and valid
	 */
	public JadscAppliReviewAndValid create(long jadscAppliReviewAndValidId);

	/**
	 * Removes the jadsc appli review and valid with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid that was removed
	 * @throws NoSuchJadscAppliReviewAndValidException if a jadsc appli review and valid with the primary key could not be found
	 */
	public JadscAppliReviewAndValid remove(long jadscAppliReviewAndValidId)
		throws NoSuchJadscAppliReviewAndValidException;

	public JadscAppliReviewAndValid updateImpl(
		JadscAppliReviewAndValid jadscAppliReviewAndValid);

	/**
	 * Returns the jadsc appli review and valid with the primary key or throws a <code>NoSuchJadscAppliReviewAndValidException</code> if it could not be found.
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a jadsc appli review and valid with the primary key could not be found
	 */
	public JadscAppliReviewAndValid findByPrimaryKey(
			long jadscAppliReviewAndValidId)
		throws NoSuchJadscAppliReviewAndValidException;

	/**
	 * Returns the jadsc appli review and valid with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid, or <code>null</code> if a jadsc appli review and valid with the primary key could not be found
	 */
	public JadscAppliReviewAndValid fetchByPrimaryKey(
		long jadscAppliReviewAndValidId);

	/**
	 * Returns all the jadsc appli review and valids.
	 *
	 * @return the jadsc appli review and valids
	 */
	public java.util.List<JadscAppliReviewAndValid> findAll();

	/**
	 * Returns a range of all the jadsc appli review and valids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @return the range of jadsc appli review and valids
	 */
	public java.util.List<JadscAppliReviewAndValid> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jadsc appli review and valids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc appli review and valids
	 */
	public java.util.List<JadscAppliReviewAndValid> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliReviewAndValid> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc appli review and valids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc appli review and valids
	 */
	public java.util.List<JadscAppliReviewAndValid> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliReviewAndValid> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc appli review and valids from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc appli review and valids.
	 *
	 * @return the number of jadsc appli review and valids
	 */
	public int countAll();

}