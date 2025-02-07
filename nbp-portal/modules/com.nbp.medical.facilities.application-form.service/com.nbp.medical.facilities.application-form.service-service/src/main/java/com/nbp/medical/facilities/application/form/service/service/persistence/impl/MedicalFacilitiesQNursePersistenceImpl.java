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

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesQNurseException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesQNurse;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesQNurseTable;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesQNurseImpl;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesQNurseModelImpl;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesQNursePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesQNurseUtil;
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
 * The persistence implementation for the medical facilities q nurse service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalFacilitiesQNursePersistence.class)
public class MedicalFacilitiesQNursePersistenceImpl
	extends BasePersistenceImpl<MedicalFacilitiesQNurse>
	implements MedicalFacilitiesQNursePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalFacilitiesQNurseUtil</code> to access the medical facilities q nurse persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalFacilitiesQNurseImpl.class.getName();

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
	 * Returns all the medical facilities q nurses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities q nurses
	 */
	@Override
	public List<MedicalFacilitiesQNurse> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities q nurses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @return the range of matching medical facilities q nurses
	 */
	@Override
	public List<MedicalFacilitiesQNurse> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities q nurses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities q nurses
	 */
	@Override
	public List<MedicalFacilitiesQNurse> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesQNurse> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities q nurses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities q nurses
	 */
	@Override
	public List<MedicalFacilitiesQNurse> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesQNurse> orderByComparator,
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

		List<MedicalFacilitiesQNurse> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesQNurse>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesQNurse medicalFacilitiesQNurse : list) {
					if (!uuid.equals(medicalFacilitiesQNurse.getUuid())) {
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

			sb.append(_SQL_SELECT_MEDICALFACILITIESQNURSE_WHERE);

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
				sb.append(MedicalFacilitiesQNurseModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalFacilitiesQNurse>)QueryUtil.list(
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
	 * Returns the first medical facilities q nurse in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a matching medical facilities q nurse could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesQNurse> orderByComparator)
		throws NoSuchMedicalFacilitiesQNurseException {

		MedicalFacilitiesQNurse medicalFacilitiesQNurse = fetchByUuid_First(
			uuid, orderByComparator);

		if (medicalFacilitiesQNurse != null) {
			return medicalFacilitiesQNurse;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesQNurseException(sb.toString());
	}

	/**
	 * Returns the first medical facilities q nurse in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesQNurse> orderByComparator) {

		List<MedicalFacilitiesQNurse> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities q nurse in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a matching medical facilities q nurse could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesQNurse> orderByComparator)
		throws NoSuchMedicalFacilitiesQNurseException {

		MedicalFacilitiesQNurse medicalFacilitiesQNurse = fetchByUuid_Last(
			uuid, orderByComparator);

		if (medicalFacilitiesQNurse != null) {
			return medicalFacilitiesQNurse;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesQNurseException(sb.toString());
	}

	/**
	 * Returns the last medical facilities q nurse in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesQNurse> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesQNurse> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities q nurses before and after the current medical facilities q nurse in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesQNurseId the primary key of the current medical facilities q nurse
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a medical facilities q nurse with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse[] findByUuid_PrevAndNext(
			long medicalFacilitiesQNurseId, String uuid,
			OrderByComparator<MedicalFacilitiesQNurse> orderByComparator)
		throws NoSuchMedicalFacilitiesQNurseException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesQNurse medicalFacilitiesQNurse = findByPrimaryKey(
			medicalFacilitiesQNurseId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesQNurse[] array =
				new MedicalFacilitiesQNurseImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, medicalFacilitiesQNurse, uuid, orderByComparator,
				true);

			array[1] = medicalFacilitiesQNurse;

			array[2] = getByUuid_PrevAndNext(
				session, medicalFacilitiesQNurse, uuid, orderByComparator,
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

	protected MedicalFacilitiesQNurse getByUuid_PrevAndNext(
		Session session, MedicalFacilitiesQNurse medicalFacilitiesQNurse,
		String uuid,
		OrderByComparator<MedicalFacilitiesQNurse> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESQNURSE_WHERE);

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
			sb.append(MedicalFacilitiesQNurseModelImpl.ORDER_BY_JPQL);
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
						medicalFacilitiesQNurse)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesQNurse> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities q nurses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MedicalFacilitiesQNurse medicalFacilitiesQNurse :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesQNurse);
		}
	}

	/**
	 * Returns the number of medical facilities q nurses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities q nurses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESQNURSE_WHERE);

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
		"medicalFacilitiesQNurse.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(medicalFacilitiesQNurse.uuid IS NULL OR medicalFacilitiesQNurse.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the medical facilities q nurse where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesQNurseException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a matching medical facilities q nurse could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesQNurseException {

		MedicalFacilitiesQNurse medicalFacilitiesQNurse = fetchByUUID_G(
			uuid, groupId);

		if (medicalFacilitiesQNurse == null) {
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

			throw new NoSuchMedicalFacilitiesQNurseException(sb.toString());
		}

		return medicalFacilitiesQNurse;
	}

	/**
	 * Returns the medical facilities q nurse where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the medical facilities q nurse where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse fetchByUUID_G(
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

		if (result instanceof MedicalFacilitiesQNurse) {
			MedicalFacilitiesQNurse medicalFacilitiesQNurse =
				(MedicalFacilitiesQNurse)result;

			if (!Objects.equals(uuid, medicalFacilitiesQNurse.getUuid()) ||
				(groupId != medicalFacilitiesQNurse.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MEDICALFACILITIESQNURSE_WHERE);

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

				List<MedicalFacilitiesQNurse> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MedicalFacilitiesQNurse medicalFacilitiesQNurse = list.get(
						0);

					result = medicalFacilitiesQNurse;

					cacheResult(medicalFacilitiesQNurse);
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
			return (MedicalFacilitiesQNurse)result;
		}
	}

	/**
	 * Removes the medical facilities q nurse where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities q nurse that was removed
	 */
	@Override
	public MedicalFacilitiesQNurse removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesQNurseException {

		MedicalFacilitiesQNurse medicalFacilitiesQNurse = findByUUID_G(
			uuid, groupId);

		return remove(medicalFacilitiesQNurse);
	}

	/**
	 * Returns the number of medical facilities q nurses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities q nurses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESQNURSE_WHERE);

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
		"medicalFacilitiesQNurse.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(medicalFacilitiesQNurse.uuid IS NULL OR medicalFacilitiesQNurse.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"medicalFacilitiesQNurse.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the medical facilities q nurses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities q nurses
	 */
	@Override
	public List<MedicalFacilitiesQNurse> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities q nurses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @return the range of matching medical facilities q nurses
	 */
	@Override
	public List<MedicalFacilitiesQNurse> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities q nurses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities q nurses
	 */
	@Override
	public List<MedicalFacilitiesQNurse> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesQNurse> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities q nurses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities q nurses
	 */
	@Override
	public List<MedicalFacilitiesQNurse> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesQNurse> orderByComparator,
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

		List<MedicalFacilitiesQNurse> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesQNurse>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesQNurse medicalFacilitiesQNurse : list) {
					if (!uuid.equals(medicalFacilitiesQNurse.getUuid()) ||
						(companyId != medicalFacilitiesQNurse.getCompanyId())) {

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

			sb.append(_SQL_SELECT_MEDICALFACILITIESQNURSE_WHERE);

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
				sb.append(MedicalFacilitiesQNurseModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalFacilitiesQNurse>)QueryUtil.list(
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
	 * Returns the first medical facilities q nurse in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a matching medical facilities q nurse could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesQNurse> orderByComparator)
		throws NoSuchMedicalFacilitiesQNurseException {

		MedicalFacilitiesQNurse medicalFacilitiesQNurse = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (medicalFacilitiesQNurse != null) {
			return medicalFacilitiesQNurse;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesQNurseException(sb.toString());
	}

	/**
	 * Returns the first medical facilities q nurse in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesQNurse> orderByComparator) {

		List<MedicalFacilitiesQNurse> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities q nurse in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a matching medical facilities q nurse could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesQNurse> orderByComparator)
		throws NoSuchMedicalFacilitiesQNurseException {

		MedicalFacilitiesQNurse medicalFacilitiesQNurse = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (medicalFacilitiesQNurse != null) {
			return medicalFacilitiesQNurse;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesQNurseException(sb.toString());
	}

	/**
	 * Returns the last medical facilities q nurse in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesQNurse> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesQNurse> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities q nurses before and after the current medical facilities q nurse in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesQNurseId the primary key of the current medical facilities q nurse
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a medical facilities q nurse with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesQNurseId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesQNurse> orderByComparator)
		throws NoSuchMedicalFacilitiesQNurseException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesQNurse medicalFacilitiesQNurse = findByPrimaryKey(
			medicalFacilitiesQNurseId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesQNurse[] array =
				new MedicalFacilitiesQNurseImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesQNurse, uuid, companyId,
				orderByComparator, true);

			array[1] = medicalFacilitiesQNurse;

			array[2] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesQNurse, uuid, companyId,
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

	protected MedicalFacilitiesQNurse getByUuid_C_PrevAndNext(
		Session session, MedicalFacilitiesQNurse medicalFacilitiesQNurse,
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesQNurse> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESQNURSE_WHERE);

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
			sb.append(MedicalFacilitiesQNurseModelImpl.ORDER_BY_JPQL);
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
						medicalFacilitiesQNurse)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesQNurse> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities q nurses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MedicalFacilitiesQNurse medicalFacilitiesQNurse :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(medicalFacilitiesQNurse);
		}
	}

	/**
	 * Returns the number of medical facilities q nurses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities q nurses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESQNURSE_WHERE);

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
		"medicalFacilitiesQNurse.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(medicalFacilitiesQNurse.uuid IS NULL OR medicalFacilitiesQNurse.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"medicalFacilitiesQNurse.companyId = ?";

	private FinderPath _finderPathFetchBygetMedicalFacilitiesById;
	private FinderPath _finderPathCountBygetMedicalFacilitiesById;

	/**
	 * Returns the medical facilities q nurse where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFacilitiesQNurseException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a matching medical facilities q nurse could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesQNurseException {

		MedicalFacilitiesQNurse medicalFacilitiesQNurse =
			fetchBygetMedicalFacilitiesById(medicalFacilitiesAppId);

		if (medicalFacilitiesQNurse == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("medicalFacilitiesAppId=");
			sb.append(medicalFacilitiesAppId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalFacilitiesQNurseException(sb.toString());
		}

		return medicalFacilitiesQNurse;
	}

	/**
	 * Returns the medical facilities q nurse where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return fetchBygetMedicalFacilitiesById(medicalFacilitiesAppId, true);
	}

	/**
	 * Returns the medical facilities q nurse where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse fetchBygetMedicalFacilitiesById(
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

		if (result instanceof MedicalFacilitiesQNurse) {
			MedicalFacilitiesQNurse medicalFacilitiesQNurse =
				(MedicalFacilitiesQNurse)result;

			if (medicalFacilitiesAppId !=
					medicalFacilitiesQNurse.getMedicalFacilitiesAppId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALFACILITIESQNURSE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				List<MedicalFacilitiesQNurse> list = query.list();

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
								"MedicalFacilitiesQNursePersistenceImpl.fetchBygetMedicalFacilitiesById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalFacilitiesQNurse medicalFacilitiesQNurse = list.get(
						0);

					result = medicalFacilitiesQNurse;

					cacheResult(medicalFacilitiesQNurse);
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
			return (MedicalFacilitiesQNurse)result;
		}
	}

	/**
	 * Removes the medical facilities q nurse where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilities q nurse that was removed
	 */
	@Override
	public MedicalFacilitiesQNurse removeBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesQNurseException {

		MedicalFacilitiesQNurse medicalFacilitiesQNurse =
			findBygetMedicalFacilitiesById(medicalFacilitiesAppId);

		return remove(medicalFacilitiesQNurse);
	}

	/**
	 * Returns the number of medical facilities q nurses where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities q nurses
	 */
	@Override
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {
		FinderPath finderPath = _finderPathCountBygetMedicalFacilitiesById;

		Object[] finderArgs = new Object[] {medicalFacilitiesAppId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESQNURSE_WHERE);

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
			"medicalFacilitiesQNurse.medicalFacilitiesAppId = ?";

	public MedicalFacilitiesQNursePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MedicalFacilitiesQNurse.class);

		setModelImplClass(MedicalFacilitiesQNurseImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalFacilitiesQNurseTable.INSTANCE);
	}

	/**
	 * Caches the medical facilities q nurse in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesQNurse the medical facilities q nurse
	 */
	@Override
	public void cacheResult(MedicalFacilitiesQNurse medicalFacilitiesQNurse) {
		entityCache.putResult(
			MedicalFacilitiesQNurseImpl.class,
			medicalFacilitiesQNurse.getPrimaryKey(), medicalFacilitiesQNurse);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				medicalFacilitiesQNurse.getUuid(),
				medicalFacilitiesQNurse.getGroupId()
			},
			medicalFacilitiesQNurse);

		finderCache.putResult(
			_finderPathFetchBygetMedicalFacilitiesById,
			new Object[] {medicalFacilitiesQNurse.getMedicalFacilitiesAppId()},
			medicalFacilitiesQNurse);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical facilities q nurses in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesQNurses the medical facilities q nurses
	 */
	@Override
	public void cacheResult(
		List<MedicalFacilitiesQNurse> medicalFacilitiesQNurses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalFacilitiesQNurses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalFacilitiesQNurse medicalFacilitiesQNurse :
				medicalFacilitiesQNurses) {

			if (entityCache.getResult(
					MedicalFacilitiesQNurseImpl.class,
					medicalFacilitiesQNurse.getPrimaryKey()) == null) {

				cacheResult(medicalFacilitiesQNurse);
			}
		}
	}

	/**
	 * Clears the cache for all medical facilities q nurses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalFacilitiesQNurseImpl.class);

		finderCache.clearCache(MedicalFacilitiesQNurseImpl.class);
	}

	/**
	 * Clears the cache for the medical facilities q nurse.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MedicalFacilitiesQNurse medicalFacilitiesQNurse) {
		entityCache.removeResult(
			MedicalFacilitiesQNurseImpl.class, medicalFacilitiesQNurse);
	}

	@Override
	public void clearCache(
		List<MedicalFacilitiesQNurse> medicalFacilitiesQNurses) {

		for (MedicalFacilitiesQNurse medicalFacilitiesQNurse :
				medicalFacilitiesQNurses) {

			entityCache.removeResult(
				MedicalFacilitiesQNurseImpl.class, medicalFacilitiesQNurse);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalFacilitiesQNurseImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalFacilitiesQNurseImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalFacilitiesQNurseModelImpl medicalFacilitiesQNurseModelImpl) {

		Object[] args = new Object[] {
			medicalFacilitiesQNurseModelImpl.getUuid(),
			medicalFacilitiesQNurseModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, medicalFacilitiesQNurseModelImpl);

		args = new Object[] {
			medicalFacilitiesQNurseModelImpl.getMedicalFacilitiesAppId()
		};

		finderCache.putResult(
			_finderPathCountBygetMedicalFacilitiesById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedicalFacilitiesById, args,
			medicalFacilitiesQNurseModelImpl);
	}

	/**
	 * Creates a new medical facilities q nurse with the primary key. Does not add the medical facilities q nurse to the database.
	 *
	 * @param medicalFacilitiesQNurseId the primary key for the new medical facilities q nurse
	 * @return the new medical facilities q nurse
	 */
	@Override
	public MedicalFacilitiesQNurse create(long medicalFacilitiesQNurseId) {
		MedicalFacilitiesQNurse medicalFacilitiesQNurse =
			new MedicalFacilitiesQNurseImpl();

		medicalFacilitiesQNurse.setNew(true);
		medicalFacilitiesQNurse.setPrimaryKey(medicalFacilitiesQNurseId);

		String uuid = PortalUUIDUtil.generate();

		medicalFacilitiesQNurse.setUuid(uuid);

		medicalFacilitiesQNurse.setCompanyId(CompanyThreadLocal.getCompanyId());

		return medicalFacilitiesQNurse;
	}

	/**
	 * Removes the medical facilities q nurse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesQNurseId the primary key of the medical facilities q nurse
	 * @return the medical facilities q nurse that was removed
	 * @throws NoSuchMedicalFacilitiesQNurseException if a medical facilities q nurse with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse remove(long medicalFacilitiesQNurseId)
		throws NoSuchMedicalFacilitiesQNurseException {

		return remove((Serializable)medicalFacilitiesQNurseId);
	}

	/**
	 * Removes the medical facilities q nurse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical facilities q nurse
	 * @return the medical facilities q nurse that was removed
	 * @throws NoSuchMedicalFacilitiesQNurseException if a medical facilities q nurse with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse remove(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesQNurseException {

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesQNurse medicalFacilitiesQNurse =
				(MedicalFacilitiesQNurse)session.get(
					MedicalFacilitiesQNurseImpl.class, primaryKey);

			if (medicalFacilitiesQNurse == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalFacilitiesQNurseException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalFacilitiesQNurse);
		}
		catch (NoSuchMedicalFacilitiesQNurseException noSuchEntityException) {
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
	protected MedicalFacilitiesQNurse removeImpl(
		MedicalFacilitiesQNurse medicalFacilitiesQNurse) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalFacilitiesQNurse)) {
				medicalFacilitiesQNurse = (MedicalFacilitiesQNurse)session.get(
					MedicalFacilitiesQNurseImpl.class,
					medicalFacilitiesQNurse.getPrimaryKeyObj());
			}

			if (medicalFacilitiesQNurse != null) {
				session.delete(medicalFacilitiesQNurse);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalFacilitiesQNurse != null) {
			clearCache(medicalFacilitiesQNurse);
		}

		return medicalFacilitiesQNurse;
	}

	@Override
	public MedicalFacilitiesQNurse updateImpl(
		MedicalFacilitiesQNurse medicalFacilitiesQNurse) {

		boolean isNew = medicalFacilitiesQNurse.isNew();

		if (!(medicalFacilitiesQNurse instanceof
				MedicalFacilitiesQNurseModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(medicalFacilitiesQNurse.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalFacilitiesQNurse);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalFacilitiesQNurse proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalFacilitiesQNurse implementation " +
					medicalFacilitiesQNurse.getClass());
		}

		MedicalFacilitiesQNurseModelImpl medicalFacilitiesQNurseModelImpl =
			(MedicalFacilitiesQNurseModelImpl)medicalFacilitiesQNurse;

		if (Validator.isNull(medicalFacilitiesQNurse.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			medicalFacilitiesQNurse.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalFacilitiesQNurse.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalFacilitiesQNurse.setCreateDate(date);
			}
			else {
				medicalFacilitiesQNurse.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalFacilitiesQNurseModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalFacilitiesQNurse.setModifiedDate(date);
			}
			else {
				medicalFacilitiesQNurse.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalFacilitiesQNurse);
			}
			else {
				medicalFacilitiesQNurse =
					(MedicalFacilitiesQNurse)session.merge(
						medicalFacilitiesQNurse);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalFacilitiesQNurseImpl.class, medicalFacilitiesQNurseModelImpl,
			false, true);

		cacheUniqueFindersCache(medicalFacilitiesQNurseModelImpl);

		if (isNew) {
			medicalFacilitiesQNurse.setNew(false);
		}

		medicalFacilitiesQNurse.resetOriginalValues();

		return medicalFacilitiesQNurse;
	}

	/**
	 * Returns the medical facilities q nurse with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical facilities q nurse
	 * @return the medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a medical facilities q nurse with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesQNurseException {

		MedicalFacilitiesQNurse medicalFacilitiesQNurse = fetchByPrimaryKey(
			primaryKey);

		if (medicalFacilitiesQNurse == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalFacilitiesQNurseException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalFacilitiesQNurse;
	}

	/**
	 * Returns the medical facilities q nurse with the primary key or throws a <code>NoSuchMedicalFacilitiesQNurseException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesQNurseId the primary key of the medical facilities q nurse
	 * @return the medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a medical facilities q nurse with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse findByPrimaryKey(
			long medicalFacilitiesQNurseId)
		throws NoSuchMedicalFacilitiesQNurseException {

		return findByPrimaryKey((Serializable)medicalFacilitiesQNurseId);
	}

	/**
	 * Returns the medical facilities q nurse with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesQNurseId the primary key of the medical facilities q nurse
	 * @return the medical facilities q nurse, or <code>null</code> if a medical facilities q nurse with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesQNurse fetchByPrimaryKey(
		long medicalFacilitiesQNurseId) {

		return fetchByPrimaryKey((Serializable)medicalFacilitiesQNurseId);
	}

	/**
	 * Returns all the medical facilities q nurses.
	 *
	 * @return the medical facilities q nurses
	 */
	@Override
	public List<MedicalFacilitiesQNurse> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities q nurses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @return the range of medical facilities q nurses
	 */
	@Override
	public List<MedicalFacilitiesQNurse> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities q nurses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities q nurses
	 */
	@Override
	public List<MedicalFacilitiesQNurse> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesQNurse> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities q nurses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities q nurses
	 */
	@Override
	public List<MedicalFacilitiesQNurse> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesQNurse> orderByComparator,
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

		List<MedicalFacilitiesQNurse> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesQNurse>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALFACILITIESQNURSE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALFACILITIESQNURSE;

				sql = sql.concat(
					MedicalFacilitiesQNurseModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalFacilitiesQNurse>)QueryUtil.list(
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
	 * Removes all the medical facilities q nurses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalFacilitiesQNurse medicalFacilitiesQNurse : findAll()) {
			remove(medicalFacilitiesQNurse);
		}
	}

	/**
	 * Returns the number of medical facilities q nurses.
	 *
	 * @return the number of medical facilities q nurses
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
					_SQL_COUNT_MEDICALFACILITIESQNURSE);

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
		return "medicalFacilitiesQNurseId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALFACILITIESQNURSE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalFacilitiesQNurseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical facilities q nurse persistence.
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

		MedicalFacilitiesQNurseUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalFacilitiesQNurseUtil.setPersistence(null);

		entityCache.removeCache(MedicalFacilitiesQNurseImpl.class.getName());
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

	private static final String _SQL_SELECT_MEDICALFACILITIESQNURSE =
		"SELECT medicalFacilitiesQNurse FROM MedicalFacilitiesQNurse medicalFacilitiesQNurse";

	private static final String _SQL_SELECT_MEDICALFACILITIESQNURSE_WHERE =
		"SELECT medicalFacilitiesQNurse FROM MedicalFacilitiesQNurse medicalFacilitiesQNurse WHERE ";

	private static final String _SQL_COUNT_MEDICALFACILITIESQNURSE =
		"SELECT COUNT(medicalFacilitiesQNurse) FROM MedicalFacilitiesQNurse medicalFacilitiesQNurse";

	private static final String _SQL_COUNT_MEDICALFACILITIESQNURSE_WHERE =
		"SELECT COUNT(medicalFacilitiesQNurse) FROM MedicalFacilitiesQNurse medicalFacilitiesQNurse WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalFacilitiesQNurse.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalFacilitiesQNurse exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalFacilitiesQNurse exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalFacilitiesQNursePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}