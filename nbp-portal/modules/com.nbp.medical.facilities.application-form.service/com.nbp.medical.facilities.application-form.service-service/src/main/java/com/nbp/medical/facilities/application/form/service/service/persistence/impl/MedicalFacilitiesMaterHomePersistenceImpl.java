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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesMaterHomeException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesMaterHome;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesMaterHomeTable;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesMaterHomeImpl;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesMaterHomeModelImpl;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesMaterHomePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesMaterHomeUtil;
import com.nbp.medical.facilities.application.form.service.service.persistence.impl.constants.MEDICAL_FACILITIESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the medical facilities mater home service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalFacilitiesMaterHomePersistence.class)
public class MedicalFacilitiesMaterHomePersistenceImpl
	extends BasePersistenceImpl<MedicalFacilitiesMaterHome>
	implements MedicalFacilitiesMaterHomePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalFacilitiesMaterHomeUtil</code> to access the medical facilities mater home persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalFacilitiesMaterHomeImpl.class.getName();

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
	 * Returns all the medical facilities mater homes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities mater homes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @return the range of matching medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator,
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

		List<MedicalFacilitiesMaterHome> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesMaterHome>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesMaterHome medicalFacilitiesMaterHome :
						list) {

					if (!uuid.equals(medicalFacilitiesMaterHome.getUuid())) {
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

			sb.append(_SQL_SELECT_MEDICALFACILITIESMATERHOME_WHERE);

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
				sb.append(MedicalFacilitiesMaterHomeModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalFacilitiesMaterHome>)QueryUtil.list(
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
	 * Returns the first medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome =
			fetchByUuid_First(uuid, orderByComparator);

		if (medicalFacilitiesMaterHome != null) {
			return medicalFacilitiesMaterHome;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesMaterHomeException(sb.toString());
	}

	/**
	 * Returns the first medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		List<MedicalFacilitiesMaterHome> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome =
			fetchByUuid_Last(uuid, orderByComparator);

		if (medicalFacilitiesMaterHome != null) {
			return medicalFacilitiesMaterHome;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesMaterHomeException(sb.toString());
	}

	/**
	 * Returns the last medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesMaterHome> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities mater homes before and after the current medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the current medical facilities mater home
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome[] findByUuid_PrevAndNext(
			long medicalFacilitiesMaterHomeId, String uuid,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome =
			findByPrimaryKey(medicalFacilitiesMaterHomeId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesMaterHome[] array =
				new MedicalFacilitiesMaterHomeImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, medicalFacilitiesMaterHome, uuid, orderByComparator,
				true);

			array[1] = medicalFacilitiesMaterHome;

			array[2] = getByUuid_PrevAndNext(
				session, medicalFacilitiesMaterHome, uuid, orderByComparator,
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

	protected MedicalFacilitiesMaterHome getByUuid_PrevAndNext(
		Session session, MedicalFacilitiesMaterHome medicalFacilitiesMaterHome,
		String uuid,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESMATERHOME_WHERE);

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
			sb.append(MedicalFacilitiesMaterHomeModelImpl.ORDER_BY_JPQL);
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
						medicalFacilitiesMaterHome)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesMaterHome> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities mater homes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MedicalFacilitiesMaterHome medicalFacilitiesMaterHome :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesMaterHome);
		}
	}

	/**
	 * Returns the number of medical facilities mater homes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities mater homes
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESMATERHOME_WHERE);

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
		"medicalFacilitiesMaterHome.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(medicalFacilitiesMaterHome.uuid IS NULL OR medicalFacilitiesMaterHome.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the medical facilities mater home where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesMaterHomeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome = fetchByUUID_G(
			uuid, groupId);

		if (medicalFacilitiesMaterHome == null) {
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

			throw new NoSuchMedicalFacilitiesMaterHomeException(sb.toString());
		}

		return medicalFacilitiesMaterHome;
	}

	/**
	 * Returns the medical facilities mater home where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the medical facilities mater home where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome fetchByUUID_G(
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

		if (result instanceof MedicalFacilitiesMaterHome) {
			MedicalFacilitiesMaterHome medicalFacilitiesMaterHome =
				(MedicalFacilitiesMaterHome)result;

			if (!Objects.equals(uuid, medicalFacilitiesMaterHome.getUuid()) ||
				(groupId != medicalFacilitiesMaterHome.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MEDICALFACILITIESMATERHOME_WHERE);

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

				List<MedicalFacilitiesMaterHome> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MedicalFacilitiesMaterHome medicalFacilitiesMaterHome =
						list.get(0);

					result = medicalFacilitiesMaterHome;

					cacheResult(medicalFacilitiesMaterHome);
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
			return (MedicalFacilitiesMaterHome)result;
		}
	}

	/**
	 * Removes the medical facilities mater home where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities mater home that was removed
	 */
	@Override
	public MedicalFacilitiesMaterHome removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome = findByUUID_G(
			uuid, groupId);

		return remove(medicalFacilitiesMaterHome);
	}

	/**
	 * Returns the number of medical facilities mater homes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities mater homes
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESMATERHOME_WHERE);

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
		"medicalFacilitiesMaterHome.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(medicalFacilitiesMaterHome.uuid IS NULL OR medicalFacilitiesMaterHome.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"medicalFacilitiesMaterHome.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @return the range of matching medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator,
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

		List<MedicalFacilitiesMaterHome> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesMaterHome>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesMaterHome medicalFacilitiesMaterHome :
						list) {

					if (!uuid.equals(medicalFacilitiesMaterHome.getUuid()) ||
						(companyId !=
							medicalFacilitiesMaterHome.getCompanyId())) {

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

			sb.append(_SQL_SELECT_MEDICALFACILITIESMATERHOME_WHERE);

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
				sb.append(MedicalFacilitiesMaterHomeModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalFacilitiesMaterHome>)QueryUtil.list(
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
	 * Returns the first medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (medicalFacilitiesMaterHome != null) {
			return medicalFacilitiesMaterHome;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesMaterHomeException(sb.toString());
	}

	/**
	 * Returns the first medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		List<MedicalFacilitiesMaterHome> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (medicalFacilitiesMaterHome != null) {
			return medicalFacilitiesMaterHome;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesMaterHomeException(sb.toString());
	}

	/**
	 * Returns the last medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesMaterHome> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities mater homes before and after the current medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the current medical facilities mater home
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesMaterHomeId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome =
			findByPrimaryKey(medicalFacilitiesMaterHomeId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesMaterHome[] array =
				new MedicalFacilitiesMaterHomeImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesMaterHome, uuid, companyId,
				orderByComparator, true);

			array[1] = medicalFacilitiesMaterHome;

			array[2] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesMaterHome, uuid, companyId,
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

	protected MedicalFacilitiesMaterHome getByUuid_C_PrevAndNext(
		Session session, MedicalFacilitiesMaterHome medicalFacilitiesMaterHome,
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESMATERHOME_WHERE);

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
			sb.append(MedicalFacilitiesMaterHomeModelImpl.ORDER_BY_JPQL);
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
						medicalFacilitiesMaterHome)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesMaterHome> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities mater homes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MedicalFacilitiesMaterHome medicalFacilitiesMaterHome :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(medicalFacilitiesMaterHome);
		}
	}

	/**
	 * Returns the number of medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities mater homes
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESMATERHOME_WHERE);

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
		"medicalFacilitiesMaterHome.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(medicalFacilitiesMaterHome.uuid IS NULL OR medicalFacilitiesMaterHome.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"medicalFacilitiesMaterHome.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMedicalFacilitiesById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMedicalFacilitiesById;
	private FinderPath _finderPathCountBygetMedicalFacilitiesById;

	/**
	 * Returns all the medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @return the range of matching medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMedicalFacilitiesById;
				finderArgs = new Object[] {medicalFacilitiesAppId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetMedicalFacilitiesById;
			finderArgs = new Object[] {
				medicalFacilitiesAppId, start, end, orderByComparator
			};
		}

		List<MedicalFacilitiesMaterHome> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesMaterHome>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesMaterHome medicalFacilitiesMaterHome :
						list) {

					if (medicalFacilitiesAppId !=
							medicalFacilitiesMaterHome.
								getMedicalFacilitiesAppId()) {

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

			sb.append(_SQL_SELECT_MEDICALFACILITIESMATERHOME_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesMaterHomeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				list = (List<MedicalFacilitiesMaterHome>)QueryUtil.list(
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
	 * Returns the first medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome findBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome =
			fetchBygetMedicalFacilitiesById_First(
				medicalFacilitiesAppId, orderByComparator);

		if (medicalFacilitiesMaterHome != null) {
			return medicalFacilitiesMaterHome;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesMaterHomeException(sb.toString());
	}

	/**
	 * Returns the first medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome fetchBygetMedicalFacilitiesById_First(
		long medicalFacilitiesAppId,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		List<MedicalFacilitiesMaterHome> list = findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome findBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome =
			fetchBygetMedicalFacilitiesById_Last(
				medicalFacilitiesAppId, orderByComparator);

		if (medicalFacilitiesMaterHome != null) {
			return medicalFacilitiesMaterHome;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesMaterHomeException(sb.toString());
	}

	/**
	 * Returns the last medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome fetchBygetMedicalFacilitiesById_Last(
		long medicalFacilitiesAppId,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		int count = countBygetMedicalFacilitiesById(medicalFacilitiesAppId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesMaterHome> list = findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities mater homes before and after the current medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the current medical facilities mater home
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesMaterHomeId, long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome =
			findByPrimaryKey(medicalFacilitiesMaterHomeId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesMaterHome[] array =
				new MedicalFacilitiesMaterHomeImpl[3];

			array[0] = getBygetMedicalFacilitiesById_PrevAndNext(
				session, medicalFacilitiesMaterHome, medicalFacilitiesAppId,
				orderByComparator, true);

			array[1] = medicalFacilitiesMaterHome;

			array[2] = getBygetMedicalFacilitiesById_PrevAndNext(
				session, medicalFacilitiesMaterHome, medicalFacilitiesAppId,
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

	protected MedicalFacilitiesMaterHome
		getBygetMedicalFacilitiesById_PrevAndNext(
			Session session,
			MedicalFacilitiesMaterHome medicalFacilitiesMaterHome,
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESMATERHOME_WHERE);

		sb.append(
			_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2);

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
			sb.append(MedicalFacilitiesMaterHomeModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(medicalFacilitiesAppId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalFacilitiesMaterHome)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesMaterHome> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities mater homes where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	@Override
	public void removeBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {
		for (MedicalFacilitiesMaterHome medicalFacilitiesMaterHome :
				findBygetMedicalFacilitiesById(
					medicalFacilitiesAppId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesMaterHome);
		}
	}

	/**
	 * Returns the number of medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities mater homes
	 */
	@Override
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {
		FinderPath finderPath = _finderPathCountBygetMedicalFacilitiesById;

		Object[] finderArgs = new Object[] {medicalFacilitiesAppId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESMATERHOME_WHERE);

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
			"medicalFacilitiesMaterHome.medicalFacilitiesAppId = ?";

	public MedicalFacilitiesMaterHomePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MedicalFacilitiesMaterHome.class);

		setModelImplClass(MedicalFacilitiesMaterHomeImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalFacilitiesMaterHomeTable.INSTANCE);
	}

	/**
	 * Caches the medical facilities mater home in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesMaterHome the medical facilities mater home
	 */
	@Override
	public void cacheResult(
		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome) {

		entityCache.putResult(
			MedicalFacilitiesMaterHomeImpl.class,
			medicalFacilitiesMaterHome.getPrimaryKey(),
			medicalFacilitiesMaterHome);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				medicalFacilitiesMaterHome.getUuid(),
				medicalFacilitiesMaterHome.getGroupId()
			},
			medicalFacilitiesMaterHome);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical facilities mater homes in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesMaterHomes the medical facilities mater homes
	 */
	@Override
	public void cacheResult(
		List<MedicalFacilitiesMaterHome> medicalFacilitiesMaterHomes) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalFacilitiesMaterHomes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalFacilitiesMaterHome medicalFacilitiesMaterHome :
				medicalFacilitiesMaterHomes) {

			if (entityCache.getResult(
					MedicalFacilitiesMaterHomeImpl.class,
					medicalFacilitiesMaterHome.getPrimaryKey()) == null) {

				cacheResult(medicalFacilitiesMaterHome);
			}
		}
	}

	/**
	 * Clears the cache for all medical facilities mater homes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalFacilitiesMaterHomeImpl.class);

		finderCache.clearCache(MedicalFacilitiesMaterHomeImpl.class);
	}

	/**
	 * Clears the cache for the medical facilities mater home.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome) {

		entityCache.removeResult(
			MedicalFacilitiesMaterHomeImpl.class, medicalFacilitiesMaterHome);
	}

	@Override
	public void clearCache(
		List<MedicalFacilitiesMaterHome> medicalFacilitiesMaterHomes) {

		for (MedicalFacilitiesMaterHome medicalFacilitiesMaterHome :
				medicalFacilitiesMaterHomes) {

			entityCache.removeResult(
				MedicalFacilitiesMaterHomeImpl.class,
				medicalFacilitiesMaterHome);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalFacilitiesMaterHomeImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalFacilitiesMaterHomeImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalFacilitiesMaterHomeModelImpl
			medicalFacilitiesMaterHomeModelImpl) {

		Object[] args = new Object[] {
			medicalFacilitiesMaterHomeModelImpl.getUuid(),
			medicalFacilitiesMaterHomeModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			medicalFacilitiesMaterHomeModelImpl);
	}

	/**
	 * Creates a new medical facilities mater home with the primary key. Does not add the medical facilities mater home to the database.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key for the new medical facilities mater home
	 * @return the new medical facilities mater home
	 */
	@Override
	public MedicalFacilitiesMaterHome create(
		long medicalFacilitiesMaterHomeId) {

		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome =
			new MedicalFacilitiesMaterHomeImpl();

		medicalFacilitiesMaterHome.setNew(true);
		medicalFacilitiesMaterHome.setPrimaryKey(medicalFacilitiesMaterHomeId);

		String uuid = PortalUUIDUtil.generate();

		medicalFacilitiesMaterHome.setUuid(uuid);

		medicalFacilitiesMaterHome.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return medicalFacilitiesMaterHome;
	}

	/**
	 * Removes the medical facilities mater home with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the medical facilities mater home
	 * @return the medical facilities mater home that was removed
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome remove(long medicalFacilitiesMaterHomeId)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		return remove((Serializable)medicalFacilitiesMaterHomeId);
	}

	/**
	 * Removes the medical facilities mater home with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical facilities mater home
	 * @return the medical facilities mater home that was removed
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome remove(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesMaterHome medicalFacilitiesMaterHome =
				(MedicalFacilitiesMaterHome)session.get(
					MedicalFacilitiesMaterHomeImpl.class, primaryKey);

			if (medicalFacilitiesMaterHome == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalFacilitiesMaterHomeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalFacilitiesMaterHome);
		}
		catch (NoSuchMedicalFacilitiesMaterHomeException
					noSuchEntityException) {

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
	protected MedicalFacilitiesMaterHome removeImpl(
		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalFacilitiesMaterHome)) {
				medicalFacilitiesMaterHome =
					(MedicalFacilitiesMaterHome)session.get(
						MedicalFacilitiesMaterHomeImpl.class,
						medicalFacilitiesMaterHome.getPrimaryKeyObj());
			}

			if (medicalFacilitiesMaterHome != null) {
				session.delete(medicalFacilitiesMaterHome);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalFacilitiesMaterHome != null) {
			clearCache(medicalFacilitiesMaterHome);
		}

		return medicalFacilitiesMaterHome;
	}

	@Override
	public MedicalFacilitiesMaterHome updateImpl(
		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome) {

		boolean isNew = medicalFacilitiesMaterHome.isNew();

		if (!(medicalFacilitiesMaterHome instanceof
				MedicalFacilitiesMaterHomeModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(medicalFacilitiesMaterHome.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalFacilitiesMaterHome);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalFacilitiesMaterHome proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalFacilitiesMaterHome implementation " +
					medicalFacilitiesMaterHome.getClass());
		}

		MedicalFacilitiesMaterHomeModelImpl
			medicalFacilitiesMaterHomeModelImpl =
				(MedicalFacilitiesMaterHomeModelImpl)medicalFacilitiesMaterHome;

		if (Validator.isNull(medicalFacilitiesMaterHome.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			medicalFacilitiesMaterHome.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalFacilitiesMaterHome.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalFacilitiesMaterHome.setCreateDate(date);
			}
			else {
				medicalFacilitiesMaterHome.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalFacilitiesMaterHomeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalFacilitiesMaterHome.setModifiedDate(date);
			}
			else {
				medicalFacilitiesMaterHome.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalFacilitiesMaterHome);
			}
			else {
				medicalFacilitiesMaterHome =
					(MedicalFacilitiesMaterHome)session.merge(
						medicalFacilitiesMaterHome);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalFacilitiesMaterHomeImpl.class,
			medicalFacilitiesMaterHomeModelImpl, false, true);

		cacheUniqueFindersCache(medicalFacilitiesMaterHomeModelImpl);

		if (isNew) {
			medicalFacilitiesMaterHome.setNew(false);
		}

		medicalFacilitiesMaterHome.resetOriginalValues();

		return medicalFacilitiesMaterHome;
	}

	/**
	 * Returns the medical facilities mater home with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical facilities mater home
	 * @return the medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome =
			fetchByPrimaryKey(primaryKey);

		if (medicalFacilitiesMaterHome == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalFacilitiesMaterHomeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalFacilitiesMaterHome;
	}

	/**
	 * Returns the medical facilities mater home with the primary key or throws a <code>NoSuchMedicalFacilitiesMaterHomeException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the medical facilities mater home
	 * @return the medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome findByPrimaryKey(
			long medicalFacilitiesMaterHomeId)
		throws NoSuchMedicalFacilitiesMaterHomeException {

		return findByPrimaryKey((Serializable)medicalFacilitiesMaterHomeId);
	}

	/**
	 * Returns the medical facilities mater home with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the medical facilities mater home
	 * @return the medical facilities mater home, or <code>null</code> if a medical facilities mater home with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesMaterHome fetchByPrimaryKey(
		long medicalFacilitiesMaterHomeId) {

		return fetchByPrimaryKey((Serializable)medicalFacilitiesMaterHomeId);
	}

	/**
	 * Returns all the medical facilities mater homes.
	 *
	 * @return the medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities mater homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @return the range of medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities mater homes
	 */
	@Override
	public List<MedicalFacilitiesMaterHome> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator,
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

		List<MedicalFacilitiesMaterHome> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesMaterHome>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALFACILITIESMATERHOME);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALFACILITIESMATERHOME;

				sql = sql.concat(
					MedicalFacilitiesMaterHomeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalFacilitiesMaterHome>)QueryUtil.list(
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
	 * Removes all the medical facilities mater homes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalFacilitiesMaterHome medicalFacilitiesMaterHome :
				findAll()) {

			remove(medicalFacilitiesMaterHome);
		}
	}

	/**
	 * Returns the number of medical facilities mater homes.
	 *
	 * @return the number of medical facilities mater homes
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
					_SQL_COUNT_MEDICALFACILITIESMATERHOME);

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
		return "medicalFacilitiesMaterHomeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALFACILITIESMATERHOME;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalFacilitiesMaterHomeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical facilities mater home persistence.
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

		_finderPathWithPaginationFindBygetMedicalFacilitiesById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetMedicalFacilitiesById",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"medicalFacilitiesAppId"}, true);

		_finderPathWithoutPaginationFindBygetMedicalFacilitiesById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMedicalFacilitiesById",
				new String[] {Long.class.getName()},
				new String[] {"medicalFacilitiesAppId"}, true);

		_finderPathCountBygetMedicalFacilitiesById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalFacilitiesById",
			new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, false);

		MedicalFacilitiesMaterHomeUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalFacilitiesMaterHomeUtil.setPersistence(null);

		entityCache.removeCache(MedicalFacilitiesMaterHomeImpl.class.getName());
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

	private static final String _SQL_SELECT_MEDICALFACILITIESMATERHOME =
		"SELECT medicalFacilitiesMaterHome FROM MedicalFacilitiesMaterHome medicalFacilitiesMaterHome";

	private static final String _SQL_SELECT_MEDICALFACILITIESMATERHOME_WHERE =
		"SELECT medicalFacilitiesMaterHome FROM MedicalFacilitiesMaterHome medicalFacilitiesMaterHome WHERE ";

	private static final String _SQL_COUNT_MEDICALFACILITIESMATERHOME =
		"SELECT COUNT(medicalFacilitiesMaterHome) FROM MedicalFacilitiesMaterHome medicalFacilitiesMaterHome";

	private static final String _SQL_COUNT_MEDICALFACILITIESMATERHOME_WHERE =
		"SELECT COUNT(medicalFacilitiesMaterHome) FROM MedicalFacilitiesMaterHome medicalFacilitiesMaterHome WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalFacilitiesMaterHome.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalFacilitiesMaterHome exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalFacilitiesMaterHome exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalFacilitiesMaterHomePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}