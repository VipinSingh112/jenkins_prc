/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service.persistence.impl;

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

import com.nbp.medical.stages.service.exception.NoSuchMedicalApplicationStagesException;
import com.nbp.medical.stages.service.model.MedicalApplicationStages;
import com.nbp.medical.stages.service.model.MedicalApplicationStagesTable;
import com.nbp.medical.stages.service.model.impl.MedicalApplicationStagesImpl;
import com.nbp.medical.stages.service.model.impl.MedicalApplicationStagesModelImpl;
import com.nbp.medical.stages.service.service.persistence.MedicalApplicationStagesPersistence;
import com.nbp.medical.stages.service.service.persistence.MedicalApplicationStagesUtil;
import com.nbp.medical.stages.service.service.persistence.impl.constants.MEDICAL_STAGESPersistenceConstants;

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
 * The persistence implementation for the medical application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalApplicationStagesPersistence.class)
public class MedicalApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<MedicalApplicationStages>
	implements MedicalApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalApplicationStagesUtil</code> to access the medical application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalApplicationStagesImpl.class.getName();

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
	 * Returns all the medical application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator,
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

		List<MedicalApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MedicalApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalApplicationStages medicalApplicationStages : list) {
					if (!uuid.equals(medicalApplicationStages.getUuid())) {
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

			sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE);

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
				sb.append(MedicalApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalApplicationStages>)QueryUtil.list(
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
	 * Returns the first medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages = fetchByUuid_First(
			uuid, orderByComparator);

		if (medicalApplicationStages != null) {
			return medicalApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		List<MedicalApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages = fetchByUuid_Last(
			uuid, orderByComparator);

		if (medicalApplicationStages != null) {
			return medicalApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MedicalApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical application stageses before and after the current medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param medicalStagesId the primary key of the current medical application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	@Override
	public MedicalApplicationStages[] findByUuid_PrevAndNext(
			long medicalStagesId, String uuid,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		MedicalApplicationStages medicalApplicationStages = findByPrimaryKey(
			medicalStagesId);

		Session session = null;

		try {
			session = openSession();

			MedicalApplicationStages[] array =
				new MedicalApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, medicalApplicationStages, uuid, orderByComparator,
				true);

			array[1] = medicalApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, medicalApplicationStages, uuid, orderByComparator,
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

	protected MedicalApplicationStages getByUuid_PrevAndNext(
		Session session, MedicalApplicationStages medicalApplicationStages,
		String uuid,
		OrderByComparator<MedicalApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE);

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
			sb.append(MedicalApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						medicalApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MedicalApplicationStages medicalApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalApplicationStages);
		}
	}

	/**
	 * Returns the number of medical application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALAPPLICATIONSTAGES_WHERE);

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
		"medicalApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(medicalApplicationStages.uuid IS NULL OR medicalApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the medical application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (medicalApplicationStages == null) {
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

			throw new NoSuchMedicalApplicationStagesException(sb.toString());
		}

		return medicalApplicationStages;
	}

	/**
	 * Returns the medical application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the medical application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchByUUID_G(
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

		if (result instanceof MedicalApplicationStages) {
			MedicalApplicationStages medicalApplicationStages =
				(MedicalApplicationStages)result;

			if (!Objects.equals(uuid, medicalApplicationStages.getUuid()) ||
				(groupId != medicalApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE);

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

				List<MedicalApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MedicalApplicationStages medicalApplicationStages =
						list.get(0);

					result = medicalApplicationStages;

					cacheResult(medicalApplicationStages);
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
			return (MedicalApplicationStages)result;
		}
	}

	/**
	 * Removes the medical application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical application stages that was removed
	 */
	@Override
	public MedicalApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages = findByUUID_G(
			uuid, groupId);

		return remove(medicalApplicationStages);
	}

	/**
	 * Returns the number of medical application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALAPPLICATIONSTAGES_WHERE);

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
		"medicalApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(medicalApplicationStages.uuid IS NULL OR medicalApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"medicalApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator,
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

		List<MedicalApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MedicalApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalApplicationStages medicalApplicationStages : list) {
					if (!uuid.equals(medicalApplicationStages.getUuid()) ||
						(companyId !=
							medicalApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE);

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
				sb.append(MedicalApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalApplicationStages>)QueryUtil.list(
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
	 * Returns the first medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (medicalApplicationStages != null) {
			return medicalApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		List<MedicalApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (medicalApplicationStages != null) {
			return medicalApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MedicalApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical application stageses before and after the current medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalStagesId the primary key of the current medical application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	@Override
	public MedicalApplicationStages[] findByUuid_C_PrevAndNext(
			long medicalStagesId, String uuid, long companyId,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		MedicalApplicationStages medicalApplicationStages = findByPrimaryKey(
			medicalStagesId);

		Session session = null;

		try {
			session = openSession();

			MedicalApplicationStages[] array =
				new MedicalApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, medicalApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = medicalApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, medicalApplicationStages, uuid, companyId,
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

	protected MedicalApplicationStages getByUuid_C_PrevAndNext(
		Session session, MedicalApplicationStages medicalApplicationStages,
		String uuid, long companyId,
		OrderByComparator<MedicalApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE);

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
			sb.append(MedicalApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						medicalApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MedicalApplicationStages medicalApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(medicalApplicationStages);
		}
	}

	/**
	 * Returns the number of medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALAPPLICATIONSTAGES_WHERE);

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
		"medicalApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(medicalApplicationStages.uuid IS NULL OR medicalApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"medicalApplicationStages.companyId = ?";

	private FinderPath _finderPathFetchBygetMedical_AI;
	private FinderPath _finderPathCountBygetMedical_AI;

	/**
	 * Returns the medical application stages where medicalApplicationId = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages findBygetMedical_AI(
			long medicalApplicationId)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages =
			fetchBygetMedical_AI(medicalApplicationId);

		if (medicalApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("medicalApplicationId=");
			sb.append(medicalApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalApplicationStagesException(sb.toString());
		}

		return medicalApplicationStages;
	}

	/**
	 * Returns the medical application stages where medicalApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchBygetMedical_AI(
		long medicalApplicationId) {

		return fetchBygetMedical_AI(medicalApplicationId, true);
	}

	/**
	 * Returns the medical application stages where medicalApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchBygetMedical_AI(
		long medicalApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {medicalApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedical_AI, finderArgs, this);
		}

		if (result instanceof MedicalApplicationStages) {
			MedicalApplicationStages medicalApplicationStages =
				(MedicalApplicationStages)result;

			if (medicalApplicationId !=
					medicalApplicationStages.getMedicalApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETMEDICAL_AI_MEDICALAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalApplicationId);

				List<MedicalApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedical_AI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									medicalApplicationId
								};
							}

							_log.warn(
								"MedicalApplicationStagesPersistenceImpl.fetchBygetMedical_AI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalApplicationStages medicalApplicationStages =
						list.get(0);

					result = medicalApplicationStages;

					cacheResult(medicalApplicationStages);
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
			return (MedicalApplicationStages)result;
		}
	}

	/**
	 * Removes the medical application stages where medicalApplicationId = &#63; from the database.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the medical application stages that was removed
	 */
	@Override
	public MedicalApplicationStages removeBygetMedical_AI(
			long medicalApplicationId)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages = findBygetMedical_AI(
			medicalApplicationId);

		return remove(medicalApplicationStages);
	}

	/**
	 * Returns the number of medical application stageses where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the number of matching medical application stageses
	 */
	@Override
	public int countBygetMedical_AI(long medicalApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMedical_AI;

		Object[] finderArgs = new Object[] {medicalApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETMEDICAL_AI_MEDICALAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalApplicationId);

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
		_FINDER_COLUMN_GETMEDICAL_AI_MEDICALAPPLICATIONID_2 =
			"medicalApplicationStages.medicalApplicationId = ?";

	private FinderPath _finderPathFetchBygetMedical_By_CaseIdStageName;
	private FinderPath _finderPathCountBygetMedical_By_CaseIdStageName;

	/**
	 * Returns the medical application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages findBygetMedical_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages =
			fetchBygetMedical_By_CaseIdStageName(caseId, stageName);

		if (medicalApplicationStages == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalApplicationStagesException(sb.toString());
		}

		return medicalApplicationStages;
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchBygetMedical_By_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetMedical_By_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchBygetMedical_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedical_By_CaseIdStageName, finderArgs,
				this);
		}

		if (result instanceof MedicalApplicationStages) {
			MedicalApplicationStages medicalApplicationStages =
				(MedicalApplicationStages)result;

			if (!Objects.equals(caseId, medicalApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, medicalApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGENAME_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				List<MedicalApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedical_By_CaseIdStageName,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, stageName};
							}

							_log.warn(
								"MedicalApplicationStagesPersistenceImpl.fetchBygetMedical_By_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalApplicationStages medicalApplicationStages =
						list.get(0);

					result = medicalApplicationStages;

					cacheResult(medicalApplicationStages);
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
			return (MedicalApplicationStages)result;
		}
	}

	/**
	 * Removes the medical application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the medical application stages that was removed
	 */
	@Override
	public MedicalApplicationStages removeBygetMedical_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages =
			findBygetMedical_By_CaseIdStageName(caseId, stageName);

		return remove(medicalApplicationStages);
	}

	/**
	 * Returns the number of medical application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching medical application stageses
	 */
	@Override
	public int countBygetMedical_By_CaseIdStageName(
		String caseId, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetMedical_By_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGENAME_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
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
		_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGENAME_CASEID_2 =
			"medicalApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGENAME_CASEID_3 =
			"(medicalApplicationStages.caseId IS NULL OR medicalApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGENAME_STAGENAME_2 =
			"medicalApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGENAME_STAGENAME_3 =
			"(medicalApplicationStages.stageName IS NULL OR medicalApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchByget_Medical_By_CaseId;
	private FinderPath _finderPathCountByget_Medical_By_CaseId;

	/**
	 * Returns the medical application stages where caseId = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages findByget_Medical_By_CaseId(String caseId)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages =
			fetchByget_Medical_By_CaseId(caseId);

		if (medicalApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalApplicationStagesException(sb.toString());
		}

		return medicalApplicationStages;
	}

	/**
	 * Returns the medical application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchByget_Medical_By_CaseId(
		String caseId) {

		return fetchByget_Medical_By_CaseId(caseId, true);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchByget_Medical_By_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByget_Medical_By_CaseId, finderArgs, this);
		}

		if (result instanceof MedicalApplicationStages) {
			MedicalApplicationStages medicalApplicationStages =
				(MedicalApplicationStages)result;

			if (!Objects.equals(caseId, medicalApplicationStages.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_MEDICAL_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_MEDICAL_BY_CASEID_CASEID_2);
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

				List<MedicalApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_Medical_By_CaseId, finderArgs,
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
								"MedicalApplicationStagesPersistenceImpl.fetchByget_Medical_By_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalApplicationStages medicalApplicationStages =
						list.get(0);

					result = medicalApplicationStages;

					cacheResult(medicalApplicationStages);
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
			return (MedicalApplicationStages)result;
		}
	}

	/**
	 * Removes the medical application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the medical application stages that was removed
	 */
	@Override
	public MedicalApplicationStages removeByget_Medical_By_CaseId(String caseId)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages =
			findByget_Medical_By_CaseId(caseId);

		return remove(medicalApplicationStages);
	}

	/**
	 * Returns the number of medical application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical application stageses
	 */
	@Override
	public int countByget_Medical_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountByget_Medical_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_MEDICAL_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_MEDICAL_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GET_MEDICAL_BY_CASEID_CASEID_2 =
		"medicalApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GET_MEDICAL_BY_CASEID_CASEID_3 =
		"(medicalApplicationStages.caseId IS NULL OR medicalApplicationStages.caseId = '')";

	private FinderPath _finderPathFetchBygetMedical_By_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetMedical_By_CaseIdStageStatus;

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages findBygetMedical_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages =
			fetchBygetMedical_By_CaseIdStageStatus(
				caseId, stageStatus, stageName);

		if (medicalApplicationStages == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalApplicationStagesException(sb.toString());
		}

		return medicalApplicationStages;
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchBygetMedical_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return fetchBygetMedical_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, true);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchBygetMedical_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageStatus, stageName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedical_By_CaseIdStageStatus, finderArgs,
				this);
		}

		if (result instanceof MedicalApplicationStages) {
			MedicalApplicationStages medicalApplicationStages =
				(MedicalApplicationStages)result;

			if (!Objects.equals(caseId, medicalApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, medicalApplicationStages.getStageStatus()) ||
				!Objects.equals(
					stageName, medicalApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				if (bindStageName) {
					queryPos.add(stageName);
				}

				List<MedicalApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedical_By_CaseIdStageStatus,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									caseId, stageStatus, stageName
								};
							}

							_log.warn(
								"MedicalApplicationStagesPersistenceImpl.fetchBygetMedical_By_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalApplicationStages medicalApplicationStages =
						list.get(0);

					result = medicalApplicationStages;

					cacheResult(medicalApplicationStages);
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
			return (MedicalApplicationStages)result;
		}
	}

	/**
	 * Removes the medical application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the medical application stages that was removed
	 */
	@Override
	public MedicalApplicationStages removeBygetMedical_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages =
			findBygetMedical_By_CaseIdStageStatus(
				caseId, stageStatus, stageName);

		return remove(medicalApplicationStages);
	}

	/**
	 * Returns the number of medical application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching medical application stageses
	 */
	@Override
	public int countBygetMedical_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath =
			_finderPathCountBygetMedical_By_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_MEDICALAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				if (bindStageName) {
					queryPos.add(stageName);
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
		_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_CASEID_2 =
			"medicalApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_CASEID_3 =
			"(medicalApplicationStages.caseId IS NULL OR medicalApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"medicalApplicationStages.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(medicalApplicationStages.stageStatus IS NULL OR medicalApplicationStages.stageStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_STAGENAME_2 =
			"medicalApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETMEDICAL_BY_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(medicalApplicationStages.stageName IS NULL OR medicalApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetMedical_By_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetMedical_By_CaseIdAndStatus;

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages findBygetMedical_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages =
			fetchBygetMedical_By_CaseIdAndStatus(caseId, stageStatus);

		if (medicalApplicationStages == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalApplicationStagesException(sb.toString());
		}

		return medicalApplicationStages;
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchBygetMedical_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetMedical_By_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchBygetMedical_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedical_By_CaseIdAndStatus, finderArgs,
				this);
		}

		if (result instanceof MedicalApplicationStages) {
			MedicalApplicationStages medicalApplicationStages =
				(MedicalApplicationStages)result;

			if (!Objects.equals(caseId, medicalApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, medicalApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				List<MedicalApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedical_By_CaseIdAndStatus,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, stageStatus};
							}

							_log.warn(
								"MedicalApplicationStagesPersistenceImpl.fetchBygetMedical_By_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalApplicationStages medicalApplicationStages =
						list.get(0);

					result = medicalApplicationStages;

					cacheResult(medicalApplicationStages);
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
			return (MedicalApplicationStages)result;
		}
	}

	/**
	 * Removes the medical application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the medical application stages that was removed
	 */
	@Override
	public MedicalApplicationStages removeBygetMedical_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages =
			findBygetMedical_By_CaseIdAndStatus(caseId, stageStatus);

		return remove(medicalApplicationStages);
	}

	/**
	 * Returns the number of medical application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching medical application stageses
	 */
	@Override
	public int countBygetMedical_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetMedical_By_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETMEDICAL_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
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
		_FINDER_COLUMN_GETMEDICAL_BY_CASEIDANDSTATUS_CASEID_2 =
			"medicalApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMEDICAL_BY_CASEIDANDSTATUS_CASEID_3 =
			"(medicalApplicationStages.caseId IS NULL OR medicalApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMEDICAL_BY_CASEIDANDSTATUS_STAGESTATUS_2 =
			"medicalApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETMEDICAL_BY_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(medicalApplicationStages.stageStatus IS NULL OR medicalApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetMedical_By_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetMedical_By_CaseId;
	private FinderPath _finderPathCountBygetMedical_By_CaseId;

	/**
	 * Returns all the medical application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findBygetMedical_By_CaseId(
		String caseId) {

		return findBygetMedical_By_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findBygetMedical_By_CaseId(
		String caseId, int start, int end) {

		return findBygetMedical_By_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findBygetMedical_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return findBygetMedical_By_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findBygetMedical_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMedical_By_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMedical_By_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<MedicalApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MedicalApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalApplicationStages medicalApplicationStages : list) {
					if (!caseId.equals(medicalApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICAL_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMEDICAL_BY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalApplicationStages>)QueryUtil.list(
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
	 * Returns the first medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages findBygetMedical_By_CaseId_First(
			String caseId,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages =
			fetchBygetMedical_By_CaseId_First(caseId, orderByComparator);

		if (medicalApplicationStages != null) {
			return medicalApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMedicalApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchBygetMedical_By_CaseId_First(
		String caseId,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		List<MedicalApplicationStages> list = findBygetMedical_By_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages findBygetMedical_By_CaseId_Last(
			String caseId,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages =
			fetchBygetMedical_By_CaseId_Last(caseId, orderByComparator);

		if (medicalApplicationStages != null) {
			return medicalApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMedicalApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchBygetMedical_By_CaseId_Last(
		String caseId,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		int count = countBygetMedical_By_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<MedicalApplicationStages> list = findBygetMedical_By_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical application stageses before and after the current medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param medicalStagesId the primary key of the current medical application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	@Override
	public MedicalApplicationStages[] findBygetMedical_By_CaseId_PrevAndNext(
			long medicalStagesId, String caseId,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		MedicalApplicationStages medicalApplicationStages = findByPrimaryKey(
			medicalStagesId);

		Session session = null;

		try {
			session = openSession();

			MedicalApplicationStages[] array =
				new MedicalApplicationStagesImpl[3];

			array[0] = getBygetMedical_By_CaseId_PrevAndNext(
				session, medicalApplicationStages, caseId, orderByComparator,
				true);

			array[1] = medicalApplicationStages;

			array[2] = getBygetMedical_By_CaseId_PrevAndNext(
				session, medicalApplicationStages, caseId, orderByComparator,
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

	protected MedicalApplicationStages getBygetMedical_By_CaseId_PrevAndNext(
		Session session, MedicalApplicationStages medicalApplicationStages,
		String caseId,
		OrderByComparator<MedicalApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMEDICAL_BY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETMEDICAL_BY_CASEID_CASEID_2);
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
			sb.append(MedicalApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetMedical_By_CaseId(String caseId) {
		for (MedicalApplicationStages medicalApplicationStages :
				findBygetMedical_By_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalApplicationStages);
		}
	}

	/**
	 * Returns the number of medical application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical application stageses
	 */
	@Override
	public int countBygetMedical_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMedical_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICAL_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMEDICAL_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMEDICAL_BY_CASEID_CASEID_2 =
		"medicalApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETMEDICAL_BY_CASEID_CASEID_3 =
		"(medicalApplicationStages.caseId IS NULL OR medicalApplicationStages.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetMedical_By_StageName;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMedical_By_StageName;
	private FinderPath _finderPathCountBygetMedical_By_StageName;

	/**
	 * Returns all the medical application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findBygetMedical_By_StageName(
		String stageName) {

		return findBygetMedical_By_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findBygetMedical_By_StageName(
		String stageName, int start, int end) {

		return findBygetMedical_By_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findBygetMedical_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return findBygetMedical_By_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findBygetMedical_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMedical_By_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMedical_By_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<MedicalApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MedicalApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalApplicationStages medicalApplicationStages : list) {
					if (!stageName.equals(
							medicalApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICAL_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMEDICAL_BY_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				list = (List<MedicalApplicationStages>)QueryUtil.list(
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
	 * Returns the first medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages findBygetMedical_By_StageName_First(
			String stageName,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages =
			fetchBygetMedical_By_StageName_First(stageName, orderByComparator);

		if (medicalApplicationStages != null) {
			return medicalApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchMedicalApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchBygetMedical_By_StageName_First(
		String stageName,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		List<MedicalApplicationStages> list = findBygetMedical_By_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages findBygetMedical_By_StageName_Last(
			String stageName,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages =
			fetchBygetMedical_By_StageName_Last(stageName, orderByComparator);

		if (medicalApplicationStages != null) {
			return medicalApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchMedicalApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public MedicalApplicationStages fetchBygetMedical_By_StageName_Last(
		String stageName,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		int count = countBygetMedical_By_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<MedicalApplicationStages> list = findBygetMedical_By_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical application stageses before and after the current medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param medicalStagesId the primary key of the current medical application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	@Override
	public MedicalApplicationStages[] findBygetMedical_By_StageName_PrevAndNext(
			long medicalStagesId, String stageName,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		MedicalApplicationStages medicalApplicationStages = findByPrimaryKey(
			medicalStagesId);

		Session session = null;

		try {
			session = openSession();

			MedicalApplicationStages[] array =
				new MedicalApplicationStagesImpl[3];

			array[0] = getBygetMedical_By_StageName_PrevAndNext(
				session, medicalApplicationStages, stageName, orderByComparator,
				true);

			array[1] = medicalApplicationStages;

			array[2] = getBygetMedical_By_StageName_PrevAndNext(
				session, medicalApplicationStages, stageName, orderByComparator,
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

	protected MedicalApplicationStages getBygetMedical_By_StageName_PrevAndNext(
		Session session, MedicalApplicationStages medicalApplicationStages,
		String stageName,
		OrderByComparator<MedicalApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMEDICAL_BY_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETMEDICAL_BY_STAGENAME_STAGENAME_2);
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
			sb.append(MedicalApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetMedical_By_StageName(String stageName) {
		for (MedicalApplicationStages medicalApplicationStages :
				findBygetMedical_By_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalApplicationStages);
		}
	}

	/**
	 * Returns the number of medical application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching medical application stageses
	 */
	@Override
	public int countBygetMedical_By_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetMedical_By_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICAL_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMEDICAL_BY_STAGENAME_STAGENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
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
		_FINDER_COLUMN_GETMEDICAL_BY_STAGENAME_STAGENAME_2 =
			"medicalApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETMEDICAL_BY_STAGENAME_STAGENAME_3 =
			"(medicalApplicationStages.stageName IS NULL OR medicalApplicationStages.stageName = '')";

	public MedicalApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MedicalApplicationStages.class);

		setModelImplClass(MedicalApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the medical application stages in the entity cache if it is enabled.
	 *
	 * @param medicalApplicationStages the medical application stages
	 */
	@Override
	public void cacheResult(MedicalApplicationStages medicalApplicationStages) {
		entityCache.putResult(
			MedicalApplicationStagesImpl.class,
			medicalApplicationStages.getPrimaryKey(), medicalApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				medicalApplicationStages.getUuid(),
				medicalApplicationStages.getGroupId()
			},
			medicalApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMedical_AI,
			new Object[] {medicalApplicationStages.getMedicalApplicationId()},
			medicalApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMedical_By_CaseIdStageName,
			new Object[] {
				medicalApplicationStages.getCaseId(),
				medicalApplicationStages.getStageName()
			},
			medicalApplicationStages);

		finderCache.putResult(
			_finderPathFetchByget_Medical_By_CaseId,
			new Object[] {medicalApplicationStages.getCaseId()},
			medicalApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMedical_By_CaseIdStageStatus,
			new Object[] {
				medicalApplicationStages.getCaseId(),
				medicalApplicationStages.getStageStatus(),
				medicalApplicationStages.getStageName()
			},
			medicalApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMedical_By_CaseIdAndStatus,
			new Object[] {
				medicalApplicationStages.getCaseId(),
				medicalApplicationStages.getStageStatus()
			},
			medicalApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical application stageses in the entity cache if it is enabled.
	 *
	 * @param medicalApplicationStageses the medical application stageses
	 */
	@Override
	public void cacheResult(
		List<MedicalApplicationStages> medicalApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalApplicationStages medicalApplicationStages :
				medicalApplicationStageses) {

			if (entityCache.getResult(
					MedicalApplicationStagesImpl.class,
					medicalApplicationStages.getPrimaryKey()) == null) {

				cacheResult(medicalApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all medical application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalApplicationStagesImpl.class);

		finderCache.clearCache(MedicalApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the medical application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MedicalApplicationStages medicalApplicationStages) {
		entityCache.removeResult(
			MedicalApplicationStagesImpl.class, medicalApplicationStages);
	}

	@Override
	public void clearCache(
		List<MedicalApplicationStages> medicalApplicationStageses) {

		for (MedicalApplicationStages medicalApplicationStages :
				medicalApplicationStageses) {

			entityCache.removeResult(
				MedicalApplicationStagesImpl.class, medicalApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalApplicationStagesModelImpl medicalApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			medicalApplicationStagesModelImpl.getUuid(),
			medicalApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, medicalApplicationStagesModelImpl);

		args = new Object[] {
			medicalApplicationStagesModelImpl.getMedicalApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetMedical_AI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedical_AI, args,
			medicalApplicationStagesModelImpl);

		args = new Object[] {
			medicalApplicationStagesModelImpl.getCaseId(),
			medicalApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetMedical_By_CaseIdStageName, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedical_By_CaseIdStageName, args,
			medicalApplicationStagesModelImpl);

		args = new Object[] {medicalApplicationStagesModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountByget_Medical_By_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_Medical_By_CaseId, args,
			medicalApplicationStagesModelImpl);

		args = new Object[] {
			medicalApplicationStagesModelImpl.getCaseId(),
			medicalApplicationStagesModelImpl.getStageStatus(),
			medicalApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetMedical_By_CaseIdStageStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedical_By_CaseIdStageStatus, args,
			medicalApplicationStagesModelImpl);

		args = new Object[] {
			medicalApplicationStagesModelImpl.getCaseId(),
			medicalApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetMedical_By_CaseIdAndStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedical_By_CaseIdAndStatus, args,
			medicalApplicationStagesModelImpl);
	}

	/**
	 * Creates a new medical application stages with the primary key. Does not add the medical application stages to the database.
	 *
	 * @param medicalStagesId the primary key for the new medical application stages
	 * @return the new medical application stages
	 */
	@Override
	public MedicalApplicationStages create(long medicalStagesId) {
		MedicalApplicationStages medicalApplicationStages =
			new MedicalApplicationStagesImpl();

		medicalApplicationStages.setNew(true);
		medicalApplicationStages.setPrimaryKey(medicalStagesId);

		String uuid = PortalUUIDUtil.generate();

		medicalApplicationStages.setUuid(uuid);

		medicalApplicationStages.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return medicalApplicationStages;
	}

	/**
	 * Removes the medical application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalStagesId the primary key of the medical application stages
	 * @return the medical application stages that was removed
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	@Override
	public MedicalApplicationStages remove(long medicalStagesId)
		throws NoSuchMedicalApplicationStagesException {

		return remove((Serializable)medicalStagesId);
	}

	/**
	 * Removes the medical application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical application stages
	 * @return the medical application stages that was removed
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	@Override
	public MedicalApplicationStages remove(Serializable primaryKey)
		throws NoSuchMedicalApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			MedicalApplicationStages medicalApplicationStages =
				(MedicalApplicationStages)session.get(
					MedicalApplicationStagesImpl.class, primaryKey);

			if (medicalApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalApplicationStages);
		}
		catch (NoSuchMedicalApplicationStagesException noSuchEntityException) {
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
	protected MedicalApplicationStages removeImpl(
		MedicalApplicationStages medicalApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalApplicationStages)) {
				medicalApplicationStages =
					(MedicalApplicationStages)session.get(
						MedicalApplicationStagesImpl.class,
						medicalApplicationStages.getPrimaryKeyObj());
			}

			if (medicalApplicationStages != null) {
				session.delete(medicalApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalApplicationStages != null) {
			clearCache(medicalApplicationStages);
		}

		return medicalApplicationStages;
	}

	@Override
	public MedicalApplicationStages updateImpl(
		MedicalApplicationStages medicalApplicationStages) {

		boolean isNew = medicalApplicationStages.isNew();

		if (!(medicalApplicationStages instanceof
				MedicalApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(medicalApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalApplicationStages implementation " +
					medicalApplicationStages.getClass());
		}

		MedicalApplicationStagesModelImpl medicalApplicationStagesModelImpl =
			(MedicalApplicationStagesModelImpl)medicalApplicationStages;

		if (Validator.isNull(medicalApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			medicalApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalApplicationStages.setCreateDate(date);
			}
			else {
				medicalApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalApplicationStages.setModifiedDate(date);
			}
			else {
				medicalApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalApplicationStages);
			}
			else {
				medicalApplicationStages =
					(MedicalApplicationStages)session.merge(
						medicalApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalApplicationStagesImpl.class,
			medicalApplicationStagesModelImpl, false, true);

		cacheUniqueFindersCache(medicalApplicationStagesModelImpl);

		if (isNew) {
			medicalApplicationStages.setNew(false);
		}

		medicalApplicationStages.resetOriginalValues();

		return medicalApplicationStages;
	}

	/**
	 * Returns the medical application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical application stages
	 * @return the medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	@Override
	public MedicalApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalApplicationStagesException {

		MedicalApplicationStages medicalApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (medicalApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalApplicationStages;
	}

	/**
	 * Returns the medical application stages with the primary key or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param medicalStagesId the primary key of the medical application stages
	 * @return the medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	@Override
	public MedicalApplicationStages findByPrimaryKey(long medicalStagesId)
		throws NoSuchMedicalApplicationStagesException {

		return findByPrimaryKey((Serializable)medicalStagesId);
	}

	/**
	 * Returns the medical application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalStagesId the primary key of the medical application stages
	 * @return the medical application stages, or <code>null</code> if a medical application stages with the primary key could not be found
	 */
	@Override
	public MedicalApplicationStages fetchByPrimaryKey(long medicalStagesId) {
		return fetchByPrimaryKey((Serializable)medicalStagesId);
	}

	/**
	 * Returns all the medical application stageses.
	 *
	 * @return the medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findAll(
		int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical application stageses
	 */
	@Override
	public List<MedicalApplicationStages> findAll(
		int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator,
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

		List<MedicalApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MedicalApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALAPPLICATIONSTAGES;

				sql = sql.concat(
					MedicalApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalApplicationStages>)QueryUtil.list(
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
	 * Removes all the medical application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalApplicationStages medicalApplicationStages : findAll()) {
			remove(medicalApplicationStages);
		}
	}

	/**
	 * Returns the number of medical application stageses.
	 *
	 * @return the number of medical application stageses
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
					_SQL_COUNT_MEDICALAPPLICATIONSTAGES);

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
		return "medicalStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical application stages persistence.
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

		_finderPathFetchBygetMedical_AI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedical_AI",
			new String[] {Long.class.getName()},
			new String[] {"medicalApplicationId"}, true);

		_finderPathCountBygetMedical_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMedical_AI",
			new String[] {Long.class.getName()},
			new String[] {"medicalApplicationId"}, false);

		_finderPathFetchBygetMedical_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedical_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetMedical_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedical_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchByget_Medical_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_Medical_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountByget_Medical_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_Medical_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetMedical_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedical_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, true);

		_finderPathCountBygetMedical_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedical_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, false);

		_finderPathFetchBygetMedical_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedical_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetMedical_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedical_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetMedical_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetMedical_By_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetMedical_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetMedical_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetMedical_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedical_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetMedical_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetMedical_By_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetMedical_By_StageName =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMedical_By_StageName",
				new String[] {String.class.getName()},
				new String[] {"stageName"}, true);

		_finderPathCountBygetMedical_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedical_By_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			false);

		MedicalApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(MedicalApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = MEDICAL_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MEDICAL_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MEDICAL_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MEDICALAPPLICATIONSTAGES =
		"SELECT medicalApplicationStages FROM MedicalApplicationStages medicalApplicationStages";

	private static final String _SQL_SELECT_MEDICALAPPLICATIONSTAGES_WHERE =
		"SELECT medicalApplicationStages FROM MedicalApplicationStages medicalApplicationStages WHERE ";

	private static final String _SQL_COUNT_MEDICALAPPLICATIONSTAGES =
		"SELECT COUNT(medicalApplicationStages) FROM MedicalApplicationStages medicalApplicationStages";

	private static final String _SQL_COUNT_MEDICALAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(medicalApplicationStages) FROM MedicalApplicationStages medicalApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}