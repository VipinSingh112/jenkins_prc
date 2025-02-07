/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesAppException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesAppTable;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppImpl;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppModelImpl;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesAppPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesAppUtil;
import com.nbp.medical.facilities.application.form.service.service.persistence.impl.constants.MEDICAL_FACILITIESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the medical facilities app service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalFacilitiesAppPersistence.class)
public class MedicalFacilitiesAppPersistenceImpl
	extends BasePersistenceImpl<MedicalFacilitiesApp>
	implements MedicalFacilitiesAppPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalFacilitiesAppUtil</code> to access the medical facilities app persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalFacilitiesAppImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the medical facilities apps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities apps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<MedicalFacilitiesApp> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesApp>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesApp medicalFacilitiesApp : list) {
					if (!uuid.equals(medicalFacilitiesApp.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MEDICALFACILITIESAPP_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesAppModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<MedicalFacilitiesApp>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp = fetchByUuid_First(
			uuid, orderByComparator);

		if (medicalFacilitiesApp != null) {
			return medicalFacilitiesApp;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesAppException(sb.toString());
	}

	/**
	 * Returns the first medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		List<MedicalFacilitiesApp> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp = fetchByUuid_Last(
			uuid, orderByComparator);

		if (medicalFacilitiesApp != null) {
			return medicalFacilitiesApp;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesAppException(sb.toString());
	}

	/**
	 * Returns the last medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesApp> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities apps before and after the current medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesAppId the primary key of the current medical facilities app
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesApp[] findByUuid_PrevAndNext(
			long medicalFacilitiesAppId, String uuid,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesApp medicalFacilitiesApp = findByPrimaryKey(
			medicalFacilitiesAppId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesApp[] array = new MedicalFacilitiesAppImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, medicalFacilitiesApp, uuid, orderByComparator, true);

			array[1] = medicalFacilitiesApp;

			array[2] = getByUuid_PrevAndNext(
				session, medicalFacilitiesApp, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MedicalFacilitiesApp getByUuid_PrevAndNext(
		Session session, MedicalFacilitiesApp medicalFacilitiesApp, String uuid,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MEDICALFACILITIESAPP_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MedicalFacilitiesAppModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalFacilitiesApp)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesApp> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities apps where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MedicalFacilitiesApp medicalFacilitiesApp :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesApp);
		}
	}

	/**
	 * Returns the number of medical facilities apps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities apps
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESAPP_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"medicalFacilitiesApp.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(medicalFacilitiesApp.uuid IS NULL OR medicalFacilitiesApp.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the medical facilities app where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp = fetchByUUID_G(
			uuid, groupId);

		if (medicalFacilitiesApp == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalFacilitiesAppException(sb.toString());
		}

		return medicalFacilitiesApp;
	}

	/**
	 * Returns the medical facilities app where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the medical facilities app where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof MedicalFacilitiesApp) {
			MedicalFacilitiesApp medicalFacilitiesApp =
				(MedicalFacilitiesApp)result;

			if (!Objects.equals(uuid, medicalFacilitiesApp.getUuid()) ||
				(groupId != medicalFacilitiesApp.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MEDICALFACILITIESAPP_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<MedicalFacilitiesApp> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MedicalFacilitiesApp medicalFacilitiesApp = list.get(0);

					result = medicalFacilitiesApp;

					cacheResult(medicalFacilitiesApp);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MedicalFacilitiesApp)result;
		}
	}

	/**
	 * Removes the medical facilities app where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities app that was removed
	 */
	@Override
	public MedicalFacilitiesApp removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp = findByUUID_G(uuid, groupId);

		return remove(medicalFacilitiesApp);
	}

	/**
	 * Returns the number of medical facilities apps where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities apps
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESAPP_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"medicalFacilitiesApp.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(medicalFacilitiesApp.uuid IS NULL OR medicalFacilitiesApp.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"medicalFacilitiesApp.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<MedicalFacilitiesApp> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesApp>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesApp medicalFacilitiesApp : list) {
					if (!uuid.equals(medicalFacilitiesApp.getUuid()) ||
						(companyId != medicalFacilitiesApp.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_MEDICALFACILITIESAPP_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesAppModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<MedicalFacilitiesApp>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (medicalFacilitiesApp != null) {
			return medicalFacilitiesApp;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesAppException(sb.toString());
	}

	/**
	 * Returns the first medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		List<MedicalFacilitiesApp> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (medicalFacilitiesApp != null) {
			return medicalFacilitiesApp;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesAppException(sb.toString());
	}

	/**
	 * Returns the last medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesApp> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities apps before and after the current medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the primary key of the current medical facilities app
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesApp[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesAppId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesApp medicalFacilitiesApp = findByPrimaryKey(
			medicalFacilitiesAppId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesApp[] array = new MedicalFacilitiesAppImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesApp, uuid, companyId,
				orderByComparator, true);

			array[1] = medicalFacilitiesApp;

			array[2] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesApp, uuid, companyId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MedicalFacilitiesApp getByUuid_C_PrevAndNext(
		Session session, MedicalFacilitiesApp medicalFacilitiesApp, String uuid,
		long companyId,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_MEDICALFACILITIESAPP_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MedicalFacilitiesAppModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalFacilitiesApp)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesApp> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities apps where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MedicalFacilitiesApp medicalFacilitiesApp :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(medicalFacilitiesApp);
		}
	}

	/**
	 * Returns the number of medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities apps
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESAPP_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"medicalFacilitiesApp.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(medicalFacilitiesApp.uuid IS NULL OR medicalFacilitiesApp.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"medicalFacilitiesApp.companyId = ?";

	private FinderPath _finderPathFetchBygetMedicalFacilitiesById;
	private FinderPath _finderPathCountBygetMedicalFacilitiesById;

	/**
	 * Returns the medical facilities app where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp =
			fetchBygetMedicalFacilitiesById(medicalFacilitiesAppId);

		if (medicalFacilitiesApp == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("medicalFacilitiesAppId=");
			sb.append(medicalFacilitiesAppId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalFacilitiesAppException(sb.toString());
		}

		return medicalFacilitiesApp;
	}

	/**
	 * Returns the medical facilities app where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return fetchBygetMedicalFacilitiesById(medicalFacilitiesAppId, true);
	}

	/**
	 * Returns the medical facilities app where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {medicalFacilitiesAppId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedicalFacilitiesById, finderArgs, this);
		}

		if (result instanceof MedicalFacilitiesApp) {
			MedicalFacilitiesApp medicalFacilitiesApp =
				(MedicalFacilitiesApp)result;

			if (medicalFacilitiesAppId !=
					medicalFacilitiesApp.getMedicalFacilitiesAppId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALFACILITIESAPP_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				List<MedicalFacilitiesApp> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedicalFacilitiesById,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									medicalFacilitiesAppId
								};
							}

							_log.warn(
								"MedicalFacilitiesAppPersistenceImpl.fetchBygetMedicalFacilitiesById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalFacilitiesApp medicalFacilitiesApp = list.get(0);

					result = medicalFacilitiesApp;

					cacheResult(medicalFacilitiesApp);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MedicalFacilitiesApp)result;
		}
	}

	/**
	 * Removes the medical facilities app where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilities app that was removed
	 */
	@Override
	public MedicalFacilitiesApp removeBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp =
			findBygetMedicalFacilitiesById(medicalFacilitiesAppId);

		return remove(medicalFacilitiesApp);
	}

	/**
	 * Returns the number of medical facilities apps where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities apps
	 */
	@Override
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {
		FinderPath finderPath = _finderPathCountBygetMedicalFacilitiesById;

		Object[] finderArgs = new Object[] {medicalFacilitiesAppId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESAPP_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2 =
			"medicalFacilitiesApp.medicalFacilitiesAppId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetMedicalFacilitiesBy_S_U;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMedicalFacilitiesBy_S_U;
	private FinderPath _finderPathCountBygetMedicalFacilitiesBy_S_U;

	/**
	 * Returns all the medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findBygetMedicalFacilitiesBy_S_U(
		int status, long userId) {

		return findBygetMedicalFacilitiesBy_S_U(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findBygetMedicalFacilitiesBy_S_U(
		int status, long userId, int start, int end) {

		return findBygetMedicalFacilitiesBy_S_U(
			status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findBygetMedicalFacilitiesBy_S_U(
		int status, long userId, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return findBygetMedicalFacilitiesBy_S_U(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findBygetMedicalFacilitiesBy_S_U(
		int status, long userId, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMedicalFacilitiesBy_S_U;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetMedicalFacilitiesBy_S_U;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<MedicalFacilitiesApp> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesApp>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesApp medicalFacilitiesApp : list) {
					if ((status != medicalFacilitiesApp.getStatus()) ||
						(userId != medicalFacilitiesApp.getUserId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_MEDICALFACILITIESAPP_WHERE);

			sb.append(_FINDER_COLUMN_GETMEDICALFACILITIESBY_S_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETMEDICALFACILITIESBY_S_U_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesAppModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<MedicalFacilitiesApp>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp findBygetMedicalFacilitiesBy_S_U_First(
			int status, long userId,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp =
			fetchBygetMedicalFacilitiesBy_S_U_First(
				status, userId, orderByComparator);

		if (medicalFacilitiesApp != null) {
			return medicalFacilitiesApp;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesAppException(sb.toString());
	}

	/**
	 * Returns the first medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchBygetMedicalFacilitiesBy_S_U_First(
		int status, long userId,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		List<MedicalFacilitiesApp> list = findBygetMedicalFacilitiesBy_S_U(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp findBygetMedicalFacilitiesBy_S_U_Last(
			int status, long userId,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp =
			fetchBygetMedicalFacilitiesBy_S_U_Last(
				status, userId, orderByComparator);

		if (medicalFacilitiesApp != null) {
			return medicalFacilitiesApp;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesAppException(sb.toString());
	}

	/**
	 * Returns the last medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchBygetMedicalFacilitiesBy_S_U_Last(
		int status, long userId,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		int count = countBygetMedicalFacilitiesBy_S_U(status, userId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesApp> list = findBygetMedicalFacilitiesBy_S_U(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities apps before and after the current medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the primary key of the current medical facilities app
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesApp[] findBygetMedicalFacilitiesBy_S_U_PrevAndNext(
			long medicalFacilitiesAppId, int status, long userId,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp = findByPrimaryKey(
			medicalFacilitiesAppId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesApp[] array = new MedicalFacilitiesAppImpl[3];

			array[0] = getBygetMedicalFacilitiesBy_S_U_PrevAndNext(
				session, medicalFacilitiesApp, status, userId,
				orderByComparator, true);

			array[1] = medicalFacilitiesApp;

			array[2] = getBygetMedicalFacilitiesBy_S_U_PrevAndNext(
				session, medicalFacilitiesApp, status, userId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MedicalFacilitiesApp getBygetMedicalFacilitiesBy_S_U_PrevAndNext(
		Session session, MedicalFacilitiesApp medicalFacilitiesApp, int status,
		long userId, OrderByComparator<MedicalFacilitiesApp> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_MEDICALFACILITIESAPP_WHERE);

		sb.append(_FINDER_COLUMN_GETMEDICALFACILITIESBY_S_U_STATUS_2);

		sb.append(_FINDER_COLUMN_GETMEDICALFACILITIESBY_S_U_USERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MedicalFacilitiesAppModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalFacilitiesApp)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesApp> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities apps where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetMedicalFacilitiesBy_S_U(int status, long userId) {
		for (MedicalFacilitiesApp medicalFacilitiesApp :
				findBygetMedicalFacilitiesBy_S_U(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(medicalFacilitiesApp);
		}
	}

	/**
	 * Returns the number of medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching medical facilities apps
	 */
	@Override
	public int countBygetMedicalFacilitiesBy_S_U(int status, long userId) {
		FinderPath finderPath = _finderPathCountBygetMedicalFacilitiesBy_S_U;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESAPP_WHERE);

			sb.append(_FINDER_COLUMN_GETMEDICALFACILITIESBY_S_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETMEDICALFACILITIESBY_S_U_USERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMEDICALFACILITIESBY_S_U_STATUS_2 =
			"medicalFacilitiesApp.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMEDICALFACILITIESBY_S_U_USERID_2 =
			"medicalFacilitiesApp.userId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetMedicalFacilitiesBy_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMedicalFacilitiesBy_Status;
	private FinderPath _finderPathCountBygetMedicalFacilitiesBy_Status;

	/**
	 * Returns all the medical facilities apps where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findBygetMedicalFacilitiesBy_Status(
		int status) {

		return findBygetMedicalFacilitiesBy_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities apps where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findBygetMedicalFacilitiesBy_Status(
		int status, int start, int end) {

		return findBygetMedicalFacilitiesBy_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findBygetMedicalFacilitiesBy_Status(
		int status, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return findBygetMedicalFacilitiesBy_Status(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findBygetMedicalFacilitiesBy_Status(
		int status, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMedicalFacilitiesBy_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetMedicalFacilitiesBy_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<MedicalFacilitiesApp> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesApp>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesApp medicalFacilitiesApp : list) {
					if (status != medicalFacilitiesApp.getStatus()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MEDICALFACILITIESAPP_WHERE);

			sb.append(_FINDER_COLUMN_GETMEDICALFACILITIESBY_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesAppModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<MedicalFacilitiesApp>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp findBygetMedicalFacilitiesBy_Status_First(
			int status,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp =
			fetchBygetMedicalFacilitiesBy_Status_First(
				status, orderByComparator);

		if (medicalFacilitiesApp != null) {
			return medicalFacilitiesApp;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesAppException(sb.toString());
	}

	/**
	 * Returns the first medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchBygetMedicalFacilitiesBy_Status_First(
		int status, OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		List<MedicalFacilitiesApp> list = findBygetMedicalFacilitiesBy_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp findBygetMedicalFacilitiesBy_Status_Last(
			int status,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp =
			fetchBygetMedicalFacilitiesBy_Status_Last(
				status, orderByComparator);

		if (medicalFacilitiesApp != null) {
			return medicalFacilitiesApp;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesAppException(sb.toString());
	}

	/**
	 * Returns the last medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchBygetMedicalFacilitiesBy_Status_Last(
		int status, OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		int count = countBygetMedicalFacilitiesBy_Status(status);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesApp> list = findBygetMedicalFacilitiesBy_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities apps before and after the current medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param medicalFacilitiesAppId the primary key of the current medical facilities app
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesApp[]
			findBygetMedicalFacilitiesBy_Status_PrevAndNext(
				long medicalFacilitiesAppId, int status,
				OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp = findByPrimaryKey(
			medicalFacilitiesAppId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesApp[] array = new MedicalFacilitiesAppImpl[3];

			array[0] = getBygetMedicalFacilitiesBy_Status_PrevAndNext(
				session, medicalFacilitiesApp, status, orderByComparator, true);

			array[1] = medicalFacilitiesApp;

			array[2] = getBygetMedicalFacilitiesBy_Status_PrevAndNext(
				session, medicalFacilitiesApp, status, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MedicalFacilitiesApp
		getBygetMedicalFacilitiesBy_Status_PrevAndNext(
			Session session, MedicalFacilitiesApp medicalFacilitiesApp,
			int status,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MEDICALFACILITIESAPP_WHERE);

		sb.append(_FINDER_COLUMN_GETMEDICALFACILITIESBY_STATUS_STATUS_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MedicalFacilitiesAppModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalFacilitiesApp)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesApp> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities apps where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetMedicalFacilitiesBy_Status(int status) {
		for (MedicalFacilitiesApp medicalFacilitiesApp :
				findBygetMedicalFacilitiesBy_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesApp);
		}
	}

	/**
	 * Returns the number of medical facilities apps where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching medical facilities apps
	 */
	@Override
	public int countBygetMedicalFacilitiesBy_Status(int status) {
		FinderPath finderPath = _finderPathCountBygetMedicalFacilitiesBy_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESAPP_WHERE);

			sb.append(_FINDER_COLUMN_GETMEDICALFACILITIESBY_STATUS_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMEDICALFACILITIESBY_STATUS_STATUS_2 =
			"medicalFacilitiesApp.status = ?";

	private FinderPath _finderPathFetchBygetMedicalByAppNo;
	private FinderPath _finderPathCountBygetMedicalByAppNo;

	/**
	 * Returns the medical facilities app where applicationNumber = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp findBygetMedicalByAppNo(
			String applicationNumber)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp = fetchBygetMedicalByAppNo(
			applicationNumber);

		if (medicalFacilitiesApp == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalFacilitiesAppException(sb.toString());
		}

		return medicalFacilitiesApp;
	}

	/**
	 * Returns the medical facilities app where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchBygetMedicalByAppNo(
		String applicationNumber) {

		return fetchBygetMedicalByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the medical facilities app where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchBygetMedicalByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedicalByAppNo, finderArgs, this);
		}

		if (result instanceof MedicalFacilitiesApp) {
			MedicalFacilitiesApp medicalFacilitiesApp =
				(MedicalFacilitiesApp)result;

			if (!Objects.equals(
					applicationNumber,
					medicalFacilitiesApp.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALFACILITIESAPP_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICALBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETMEDICALBYAPPNO_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
				}

				List<MedicalFacilitiesApp> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedicalByAppNo, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {applicationNumber};
							}

							_log.warn(
								"MedicalFacilitiesAppPersistenceImpl.fetchBygetMedicalByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalFacilitiesApp medicalFacilitiesApp = list.get(0);

					result = medicalFacilitiesApp;

					cacheResult(medicalFacilitiesApp);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MedicalFacilitiesApp)result;
		}
	}

	/**
	 * Removes the medical facilities app where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the medical facilities app that was removed
	 */
	@Override
	public MedicalFacilitiesApp removeBygetMedicalByAppNo(
			String applicationNumber)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp = findBygetMedicalByAppNo(
			applicationNumber);

		return remove(medicalFacilitiesApp);
	}

	/**
	 * Returns the number of medical facilities apps where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching medical facilities apps
	 */
	@Override
	public int countBygetMedicalByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetMedicalByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESAPP_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICALBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETMEDICALBYAPPNO_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMEDICALBYAPPNO_APPLICATIONNUMBER_2 =
			"medicalFacilitiesApp.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETMEDICALBYAPPNO_APPLICATIONNUMBER_3 =
			"(medicalFacilitiesApp.applicationNumber IS NULL OR medicalFacilitiesApp.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetMedicalByCaseID;
	private FinderPath _finderPathCountBygetMedicalByCaseID;

	/**
	 * Returns the medical facilities app where caseId = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp findBygetMedicalByCaseID(String caseId)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp = fetchBygetMedicalByCaseID(
			caseId);

		if (medicalFacilitiesApp == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalFacilitiesAppException(sb.toString());
		}

		return medicalFacilitiesApp;
	}

	/**
	 * Returns the medical facilities app where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchBygetMedicalByCaseID(String caseId) {
		return fetchBygetMedicalByCaseID(caseId, true);
	}

	/**
	 * Returns the medical facilities app where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchBygetMedicalByCaseID(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedicalByCaseID, finderArgs, this);
		}

		if (result instanceof MedicalFacilitiesApp) {
			MedicalFacilitiesApp medicalFacilitiesApp =
				(MedicalFacilitiesApp)result;

			if (!Objects.equals(caseId, medicalFacilitiesApp.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALFACILITIESAPP_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICALBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMEDICALBYCASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<MedicalFacilitiesApp> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedicalByCaseID, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"MedicalFacilitiesAppPersistenceImpl.fetchBygetMedicalByCaseID(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalFacilitiesApp medicalFacilitiesApp = list.get(0);

					result = medicalFacilitiesApp;

					cacheResult(medicalFacilitiesApp);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MedicalFacilitiesApp)result;
		}
	}

	/**
	 * Removes the medical facilities app where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the medical facilities app that was removed
	 */
	@Override
	public MedicalFacilitiesApp removeBygetMedicalByCaseID(String caseId)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp = findBygetMedicalByCaseID(
			caseId);

		return remove(medicalFacilitiesApp);
	}

	/**
	 * Returns the number of medical facilities apps where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical facilities apps
	 */
	@Override
	public int countBygetMedicalByCaseID(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMedicalByCaseID;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESAPP_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICALBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMEDICALBYCASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETMEDICALBYCASEID_CASEID_2 =
		"medicalFacilitiesApp.caseId = ?";

	private static final String _FINDER_COLUMN_GETMEDICALBYCASEID_CASEID_3 =
		"(medicalFacilitiesApp.caseId IS NULL OR medicalFacilitiesApp.caseId = '')";

	private FinderPath _finderPathFetchBygetMedicalByExpiredLicNum;
	private FinderPath _finderPathCountBygetMedicalByExpiredLicNum;

	/**
	 * Returns the medical facilities app where expiredLicenseAppNumber = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp findBygetMedicalByExpiredLicNum(
			String expiredLicenseAppNumber)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp =
			fetchBygetMedicalByExpiredLicNum(expiredLicenseAppNumber);

		if (medicalFacilitiesApp == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("expiredLicenseAppNumber=");
			sb.append(expiredLicenseAppNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalFacilitiesAppException(sb.toString());
		}

		return medicalFacilitiesApp;
	}

	/**
	 * Returns the medical facilities app where expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchBygetMedicalByExpiredLicNum(
		String expiredLicenseAppNumber) {

		return fetchBygetMedicalByExpiredLicNum(expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the medical facilities app where expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchBygetMedicalByExpiredLicNum(
		String expiredLicenseAppNumber, boolean useFinderCache) {

		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {expiredLicenseAppNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedicalByExpiredLicNum, finderArgs, this);
		}

		if (result instanceof MedicalFacilitiesApp) {
			MedicalFacilitiesApp medicalFacilitiesApp =
				(MedicalFacilitiesApp)result;

			if (!Objects.equals(
					expiredLicenseAppNumber,
					medicalFacilitiesApp.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALFACILITIESAPP_WHERE);

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICALBYEXPIREDLICNUM_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICALBYEXPIREDLICNUM_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				List<MedicalFacilitiesApp> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedicalByExpiredLicNum,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									expiredLicenseAppNumber
								};
							}

							_log.warn(
								"MedicalFacilitiesAppPersistenceImpl.fetchBygetMedicalByExpiredLicNum(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalFacilitiesApp medicalFacilitiesApp = list.get(0);

					result = medicalFacilitiesApp;

					cacheResult(medicalFacilitiesApp);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MedicalFacilitiesApp)result;
		}
	}

	/**
	 * Removes the medical facilities app where expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the medical facilities app that was removed
	 */
	@Override
	public MedicalFacilitiesApp removeBygetMedicalByExpiredLicNum(
			String expiredLicenseAppNumber)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp =
			findBygetMedicalByExpiredLicNum(expiredLicenseAppNumber);

		return remove(medicalFacilitiesApp);
	}

	/**
	 * Returns the number of medical facilities apps where expiredLicenseAppNumber = &#63;.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching medical facilities apps
	 */
	@Override
	public int countBygetMedicalByExpiredLicNum(
		String expiredLicenseAppNumber) {

		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetMedicalByExpiredLicNum;

		Object[] finderArgs = new Object[] {expiredLicenseAppNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESAPP_WHERE);

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICALBYEXPIREDLICNUM_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICALBYEXPIREDLICNUM_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMEDICALBYEXPIREDLICNUM_EXPIREDLICENSEAPPNUMBER_2 =
			"medicalFacilitiesApp.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETMEDICALBYEXPIREDLICNUM_EXPIREDLICENSEAPPNUMBER_3 =
			"(medicalFacilitiesApp.expiredLicenseAppNumber IS NULL OR medicalFacilitiesApp.expiredLicenseAppNumber = '')";

	public MedicalFacilitiesAppPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MedicalFacilitiesApp.class);

		setModelImplClass(MedicalFacilitiesAppImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalFacilitiesAppTable.INSTANCE);
	}

	/**
	 * Caches the medical facilities app in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesApp the medical facilities app
	 */
	@Override
	public void cacheResult(MedicalFacilitiesApp medicalFacilitiesApp) {
		entityCache.putResult(
			MedicalFacilitiesAppImpl.class,
			medicalFacilitiesApp.getPrimaryKey(), medicalFacilitiesApp);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				medicalFacilitiesApp.getUuid(),
				medicalFacilitiesApp.getGroupId()
			},
			medicalFacilitiesApp);

		finderCache.putResult(
			_finderPathFetchBygetMedicalFacilitiesById,
			new Object[] {medicalFacilitiesApp.getMedicalFacilitiesAppId()},
			medicalFacilitiesApp);

		finderCache.putResult(
			_finderPathFetchBygetMedicalByAppNo,
			new Object[] {medicalFacilitiesApp.getApplicationNumber()},
			medicalFacilitiesApp);

		finderCache.putResult(
			_finderPathFetchBygetMedicalByCaseID,
			new Object[] {medicalFacilitiesApp.getCaseId()},
			medicalFacilitiesApp);

		finderCache.putResult(
			_finderPathFetchBygetMedicalByExpiredLicNum,
			new Object[] {medicalFacilitiesApp.getExpiredLicenseAppNumber()},
			medicalFacilitiesApp);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical facilities apps in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesApps the medical facilities apps
	 */
	@Override
	public void cacheResult(List<MedicalFacilitiesApp> medicalFacilitiesApps) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalFacilitiesApps.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalFacilitiesApp medicalFacilitiesApp :
				medicalFacilitiesApps) {

			if (entityCache.getResult(
					MedicalFacilitiesAppImpl.class,
					medicalFacilitiesApp.getPrimaryKey()) == null) {

				cacheResult(medicalFacilitiesApp);
			}
		}
	}

	/**
	 * Clears the cache for all medical facilities apps.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalFacilitiesAppImpl.class);

		finderCache.clearCache(MedicalFacilitiesAppImpl.class);
	}

	/**
	 * Clears the cache for the medical facilities app.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MedicalFacilitiesApp medicalFacilitiesApp) {
		entityCache.removeResult(
			MedicalFacilitiesAppImpl.class, medicalFacilitiesApp);
	}

	@Override
	public void clearCache(List<MedicalFacilitiesApp> medicalFacilitiesApps) {
		for (MedicalFacilitiesApp medicalFacilitiesApp :
				medicalFacilitiesApps) {

			entityCache.removeResult(
				MedicalFacilitiesAppImpl.class, medicalFacilitiesApp);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalFacilitiesAppImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalFacilitiesAppImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalFacilitiesAppModelImpl medicalFacilitiesAppModelImpl) {

		Object[] args = new Object[] {
			medicalFacilitiesAppModelImpl.getUuid(),
			medicalFacilitiesAppModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, medicalFacilitiesAppModelImpl);

		args = new Object[] {
			medicalFacilitiesAppModelImpl.getMedicalFacilitiesAppId()
		};

		finderCache.putResult(
			_finderPathCountBygetMedicalFacilitiesById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedicalFacilitiesById, args,
			medicalFacilitiesAppModelImpl);

		args = new Object[] {
			medicalFacilitiesAppModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetMedicalByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedicalByAppNo, args,
			medicalFacilitiesAppModelImpl);

		args = new Object[] {medicalFacilitiesAppModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetMedicalByCaseID, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedicalByCaseID, args,
			medicalFacilitiesAppModelImpl);

		args = new Object[] {
			medicalFacilitiesAppModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetMedicalByExpiredLicNum, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedicalByExpiredLicNum, args,
			medicalFacilitiesAppModelImpl);
	}

	/**
	 * Creates a new medical facilities app with the primary key. Does not add the medical facilities app to the database.
	 *
	 * @param medicalFacilitiesAppId the primary key for the new medical facilities app
	 * @return the new medical facilities app
	 */
	@Override
	public MedicalFacilitiesApp create(long medicalFacilitiesAppId) {
		MedicalFacilitiesApp medicalFacilitiesApp =
			new MedicalFacilitiesAppImpl();

		medicalFacilitiesApp.setNew(true);
		medicalFacilitiesApp.setPrimaryKey(medicalFacilitiesAppId);

		String uuid = PortalUUIDUtil.generate();

		medicalFacilitiesApp.setUuid(uuid);

		medicalFacilitiesApp.setCompanyId(CompanyThreadLocal.getCompanyId());

		return medicalFacilitiesApp;
	}

	/**
	 * Removes the medical facilities app with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesAppId the primary key of the medical facilities app
	 * @return the medical facilities app that was removed
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesApp remove(long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesAppException {

		return remove((Serializable)medicalFacilitiesAppId);
	}

	/**
	 * Removes the medical facilities app with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical facilities app
	 * @return the medical facilities app that was removed
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesApp remove(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesAppException {

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesApp medicalFacilitiesApp =
				(MedicalFacilitiesApp)session.get(
					MedicalFacilitiesAppImpl.class, primaryKey);

			if (medicalFacilitiesApp == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalFacilitiesAppException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalFacilitiesApp);
		}
		catch (NoSuchMedicalFacilitiesAppException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected MedicalFacilitiesApp removeImpl(
		MedicalFacilitiesApp medicalFacilitiesApp) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalFacilitiesApp)) {
				medicalFacilitiesApp = (MedicalFacilitiesApp)session.get(
					MedicalFacilitiesAppImpl.class,
					medicalFacilitiesApp.getPrimaryKeyObj());
			}

			if (medicalFacilitiesApp != null) {
				session.delete(medicalFacilitiesApp);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalFacilitiesApp != null) {
			clearCache(medicalFacilitiesApp);
		}

		return medicalFacilitiesApp;
	}

	@Override
	public MedicalFacilitiesApp updateImpl(
		MedicalFacilitiesApp medicalFacilitiesApp) {

		boolean isNew = medicalFacilitiesApp.isNew();

		if (!(medicalFacilitiesApp instanceof MedicalFacilitiesAppModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(medicalFacilitiesApp.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalFacilitiesApp);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalFacilitiesApp proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalFacilitiesApp implementation " +
					medicalFacilitiesApp.getClass());
		}

		MedicalFacilitiesAppModelImpl medicalFacilitiesAppModelImpl =
			(MedicalFacilitiesAppModelImpl)medicalFacilitiesApp;

		if (Validator.isNull(medicalFacilitiesApp.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			medicalFacilitiesApp.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalFacilitiesApp.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalFacilitiesApp.setCreateDate(date);
			}
			else {
				medicalFacilitiesApp.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalFacilitiesAppModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalFacilitiesApp.setModifiedDate(date);
			}
			else {
				medicalFacilitiesApp.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalFacilitiesApp);
			}
			else {
				medicalFacilitiesApp = (MedicalFacilitiesApp)session.merge(
					medicalFacilitiesApp);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalFacilitiesAppImpl.class, medicalFacilitiesAppModelImpl,
			false, true);

		cacheUniqueFindersCache(medicalFacilitiesAppModelImpl);

		if (isNew) {
			medicalFacilitiesApp.setNew(false);
		}

		medicalFacilitiesApp.resetOriginalValues();

		return medicalFacilitiesApp;
	}

	/**
	 * Returns the medical facilities app with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical facilities app
	 * @return the medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesApp findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesAppException {

		MedicalFacilitiesApp medicalFacilitiesApp = fetchByPrimaryKey(
			primaryKey);

		if (medicalFacilitiesApp == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalFacilitiesAppException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalFacilitiesApp;
	}

	/**
	 * Returns the medical facilities app with the primary key or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the primary key of the medical facilities app
	 * @return the medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesApp findByPrimaryKey(long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesAppException {

		return findByPrimaryKey((Serializable)medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical facilities app with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the primary key of the medical facilities app
	 * @return the medical facilities app, or <code>null</code> if a medical facilities app with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesApp fetchByPrimaryKey(long medicalFacilitiesAppId) {
		return fetchByPrimaryKey((Serializable)medicalFacilitiesAppId);
	}

	/**
	 * Returns all the medical facilities apps.
	 *
	 * @return the medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities apps
	 */
	@Override
	public List<MedicalFacilitiesApp> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<MedicalFacilitiesApp> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesApp>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALFACILITIESAPP);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALFACILITIESAPP;

				sql = sql.concat(MedicalFacilitiesAppModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalFacilitiesApp>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the medical facilities apps from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalFacilitiesApp medicalFacilitiesApp : findAll()) {
			remove(medicalFacilitiesApp);
		}
	}

	/**
	 * Returns the number of medical facilities apps.
	 *
	 * @return the number of medical facilities apps
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_MEDICALFACILITIESAPP);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "medicalFacilitiesAppId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALFACILITIESAPP;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalFacilitiesAppModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical facilities app persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathFetchBygetMedicalFacilitiesById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedicalFacilitiesById",
			new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, true);

		_finderPathCountBygetMedicalFacilitiesById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalFacilitiesById",
			new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, false);

		_finderPathWithPaginationFindBygetMedicalFacilitiesBy_S_U =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetMedicalFacilitiesBy_S_U",
				new String[] {
					Integer.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetMedicalFacilitiesBy_S_U =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMedicalFacilitiesBy_S_U",
				new String[] {Integer.class.getName(), Long.class.getName()},
				new String[] {"status", "userId"}, true);

		_finderPathCountBygetMedicalFacilitiesBy_S_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalFacilitiesBy_S_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathWithPaginationFindBygetMedicalFacilitiesBy_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetMedicalFacilitiesBy_Status",
				new String[] {
					Integer.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetMedicalFacilitiesBy_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMedicalFacilitiesBy_Status",
				new String[] {Integer.class.getName()}, new String[] {"status"},
				true);

		_finderPathCountBygetMedicalFacilitiesBy_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalFacilitiesBy_Status",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathFetchBygetMedicalByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedicalByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetMedicalByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalByAppNo", new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetMedicalByCaseID = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedicalByCaseID",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMedicalByCaseID = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalByCaseID", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathFetchBygetMedicalByExpiredLicNum = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedicalByExpiredLicNum",
			new String[] {String.class.getName()},
			new String[] {"expiredLicenseAppNumber"}, true);

		_finderPathCountBygetMedicalByExpiredLicNum = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalByExpiredLicNum",
			new String[] {String.class.getName()},
			new String[] {"expiredLicenseAppNumber"}, false);

		MedicalFacilitiesAppUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalFacilitiesAppUtil.setPersistence(null);

		entityCache.removeCache(MedicalFacilitiesAppImpl.class.getName());
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MEDICALFACILITIESAPP =
		"SELECT medicalFacilitiesApp FROM MedicalFacilitiesApp medicalFacilitiesApp";

	private static final String _SQL_SELECT_MEDICALFACILITIESAPP_WHERE =
		"SELECT medicalFacilitiesApp FROM MedicalFacilitiesApp medicalFacilitiesApp WHERE ";

	private static final String _SQL_COUNT_MEDICALFACILITIESAPP =
		"SELECT COUNT(medicalFacilitiesApp) FROM MedicalFacilitiesApp medicalFacilitiesApp";

	private static final String _SQL_COUNT_MEDICALFACILITIESAPP_WHERE =
		"SELECT COUNT(medicalFacilitiesApp) FROM MedicalFacilitiesApp medicalFacilitiesApp WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalFacilitiesApp.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalFacilitiesApp exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalFacilitiesApp exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalFacilitiesAppPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}