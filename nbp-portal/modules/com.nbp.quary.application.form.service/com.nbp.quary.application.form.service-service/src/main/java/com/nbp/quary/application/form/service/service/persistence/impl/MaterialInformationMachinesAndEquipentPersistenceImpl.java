/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.quary.application.form.service.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.quary.application.form.service.exception.NoSuchMaterialInformationMachinesAndEquipentException;
import com.nbp.quary.application.form.service.model.MaterialInformationMachinesAndEquipent;
import com.nbp.quary.application.form.service.model.MaterialInformationMachinesAndEquipentTable;
import com.nbp.quary.application.form.service.model.impl.MaterialInformationMachinesAndEquipentImpl;
import com.nbp.quary.application.form.service.model.impl.MaterialInformationMachinesAndEquipentModelImpl;
import com.nbp.quary.application.form.service.service.persistence.MaterialInformationMachinesAndEquipentPersistence;
import com.nbp.quary.application.form.service.service.persistence.MaterialInformationMachinesAndEquipentUtil;
import com.nbp.quary.application.form.service.service.persistence.impl.constants.QUARRY_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
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
 * The persistence implementation for the material information machines and equipent service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {
		MaterialInformationMachinesAndEquipentPersistence.class,
		BasePersistence.class
	}
)
public class MaterialInformationMachinesAndEquipentPersistenceImpl
	extends BasePersistenceImpl<MaterialInformationMachinesAndEquipent>
	implements MaterialInformationMachinesAndEquipentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MaterialInformationMachinesAndEquipentUtil</code> to access the material information machines and equipent persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MaterialInformationMachinesAndEquipentImpl.class.getName();

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
	 * Returns all the material information machines and equipents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findByUuid(
		String uuid) {

		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the material information machines and equipents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @return the range of matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator,
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

		List<MaterialInformationMachinesAndEquipent> list = null;

		if (useFinderCache) {
			list =
				(List<MaterialInformationMachinesAndEquipent>)
					finderCache.getResult(finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (MaterialInformationMachinesAndEquipent
						materialInformationMachinesAndEquipent : list) {

					if (!uuid.equals(
							materialInformationMachinesAndEquipent.getUuid())) {

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

			sb.append(_SQL_SELECT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE);

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
				sb.append(
					MaterialInformationMachinesAndEquipentModelImpl.
						ORDER_BY_JPQL);
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

				list =
					(List<MaterialInformationMachinesAndEquipent>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent findByUuid_First(
			String uuid,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent = fetchByUuid_First(
				uuid, orderByComparator);

		if (materialInformationMachinesAndEquipent != null) {
			return materialInformationMachinesAndEquipent;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMaterialInformationMachinesAndEquipentException(
			sb.toString());
	}

	/**
	 * Returns the first material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent fetchByUuid_First(
		String uuid,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		List<MaterialInformationMachinesAndEquipent> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent findByUuid_Last(
			String uuid,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent = fetchByUuid_Last(
				uuid, orderByComparator);

		if (materialInformationMachinesAndEquipent != null) {
			return materialInformationMachinesAndEquipent;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMaterialInformationMachinesAndEquipentException(
			sb.toString());
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent fetchByUuid_Last(
		String uuid,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MaterialInformationMachinesAndEquipent> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the material information machines and equipents before and after the current material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param miMachineId the primary key of the current material information machines and equipent
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent[] findByUuid_PrevAndNext(
			long miMachineId, String uuid,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		uuid = Objects.toString(uuid, "");

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent = findByPrimaryKey(
				miMachineId);

		Session session = null;

		try {
			session = openSession();

			MaterialInformationMachinesAndEquipent[] array =
				new MaterialInformationMachinesAndEquipentImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, materialInformationMachinesAndEquipent, uuid,
				orderByComparator, true);

			array[1] = materialInformationMachinesAndEquipent;

			array[2] = getByUuid_PrevAndNext(
				session, materialInformationMachinesAndEquipent, uuid,
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

	protected MaterialInformationMachinesAndEquipent getByUuid_PrevAndNext(
		Session session,
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent,
		String uuid,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator,
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

		sb.append(_SQL_SELECT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE);

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
			sb.append(
				MaterialInformationMachinesAndEquipentModelImpl.ORDER_BY_JPQL);
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
						materialInformationMachinesAndEquipent)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MaterialInformationMachinesAndEquipent> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the material information machines and equipents where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MaterialInformationMachinesAndEquipent
				materialInformationMachinesAndEquipent :
					findByUuid(
						uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(materialInformationMachinesAndEquipent);
		}
	}

	/**
	 * Returns the number of material information machines and equipents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching material information machines and equipents
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE);

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
		"materialInformationMachinesAndEquipent.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(materialInformationMachinesAndEquipent.uuid IS NULL OR materialInformationMachinesAndEquipent.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the material information machines and equipent where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMaterialInformationMachinesAndEquipentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent findByUUID_G(
			String uuid, long groupId)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent = fetchByUUID_G(
				uuid, groupId);

		if (materialInformationMachinesAndEquipent == null) {
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

			throw new NoSuchMaterialInformationMachinesAndEquipentException(
				sb.toString());
		}

		return materialInformationMachinesAndEquipent;
	}

	/**
	 * Returns the material information machines and equipent where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the material information machines and equipent where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs,this);
		}

		if (result instanceof MaterialInformationMachinesAndEquipent) {
			MaterialInformationMachinesAndEquipent
				materialInformationMachinesAndEquipent =
					(MaterialInformationMachinesAndEquipent)result;

			if (!Objects.equals(
					uuid, materialInformationMachinesAndEquipent.getUuid()) ||
				(groupId !=
					materialInformationMachinesAndEquipent.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE);

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

				List<MaterialInformationMachinesAndEquipent> list =
					query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MaterialInformationMachinesAndEquipent
						materialInformationMachinesAndEquipent = list.get(0);

					result = materialInformationMachinesAndEquipent;

					cacheResult(materialInformationMachinesAndEquipent);
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
			return (MaterialInformationMachinesAndEquipent)result;
		}
	}

	/**
	 * Removes the material information machines and equipent where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the material information machines and equipent that was removed
	 */
	@Override
	public MaterialInformationMachinesAndEquipent removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent = findByUUID_G(
				uuid, groupId);

		return remove(materialInformationMachinesAndEquipent);
	}

	/**
	 * Returns the number of material information machines and equipents where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching material information machines and equipents
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE);

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
		"materialInformationMachinesAndEquipent.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(materialInformationMachinesAndEquipent.uuid IS NULL OR materialInformationMachinesAndEquipent.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"materialInformationMachinesAndEquipent.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the material information machines and equipents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the material information machines and equipents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @return the range of matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator,
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

		List<MaterialInformationMachinesAndEquipent> list = null;

		if (useFinderCache) {
			list =
				(List<MaterialInformationMachinesAndEquipent>)
					finderCache.getResult(finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (MaterialInformationMachinesAndEquipent
						materialInformationMachinesAndEquipent : list) {

					if (!uuid.equals(
							materialInformationMachinesAndEquipent.getUuid()) ||
						(companyId !=
							materialInformationMachinesAndEquipent.
								getCompanyId())) {

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

			sb.append(_SQL_SELECT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE);

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
				sb.append(
					MaterialInformationMachinesAndEquipentModelImpl.
						ORDER_BY_JPQL);
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

				list =
					(List<MaterialInformationMachinesAndEquipent>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first material information machines and equipent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent = fetchByUuid_C_First(
				uuid, companyId, orderByComparator);

		if (materialInformationMachinesAndEquipent != null) {
			return materialInformationMachinesAndEquipent;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMaterialInformationMachinesAndEquipentException(
			sb.toString());
	}

	/**
	 * Returns the first material information machines and equipent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		List<MaterialInformationMachinesAndEquipent> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent = fetchByUuid_C_Last(
				uuid, companyId, orderByComparator);

		if (materialInformationMachinesAndEquipent != null) {
			return materialInformationMachinesAndEquipent;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMaterialInformationMachinesAndEquipentException(
			sb.toString());
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MaterialInformationMachinesAndEquipent> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the material information machines and equipents before and after the current material information machines and equipent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miMachineId the primary key of the current material information machines and equipent
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent[] findByUuid_C_PrevAndNext(
			long miMachineId, String uuid, long companyId,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		uuid = Objects.toString(uuid, "");

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent = findByPrimaryKey(
				miMachineId);

		Session session = null;

		try {
			session = openSession();

			MaterialInformationMachinesAndEquipent[] array =
				new MaterialInformationMachinesAndEquipentImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, materialInformationMachinesAndEquipent, uuid,
				companyId, orderByComparator, true);

			array[1] = materialInformationMachinesAndEquipent;

			array[2] = getByUuid_C_PrevAndNext(
				session, materialInformationMachinesAndEquipent, uuid,
				companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MaterialInformationMachinesAndEquipent getByUuid_C_PrevAndNext(
		Session session,
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent,
		String uuid, long companyId,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator,
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

		sb.append(_SQL_SELECT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE);

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
			sb.append(
				MaterialInformationMachinesAndEquipentModelImpl.ORDER_BY_JPQL);
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
						materialInformationMachinesAndEquipent)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MaterialInformationMachinesAndEquipent> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the material information machines and equipents where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MaterialInformationMachinesAndEquipent
				materialInformationMachinesAndEquipent :
					findByUuid_C(
						uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
						null)) {

			remove(materialInformationMachinesAndEquipent);
		}
	}

	/**
	 * Returns the number of material information machines and equipents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching material information machines and equipents
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE);

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
		"materialInformationMachinesAndEquipent.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(materialInformationMachinesAndEquipent.uuid IS NULL OR materialInformationMachinesAndEquipent.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"materialInformationMachinesAndEquipent.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetQuarryById;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarryById;
	private FinderPath _finderPathCountBygetQuarryById;

	/**
	 * Returns all the material information machines and equipents where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findBygetQuarryById(
		String quarryApplicationId) {

		return findBygetQuarryById(
			quarryApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the material information machines and equipents where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @return the range of matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findBygetQuarryById(
		String quarryApplicationId, int start, int end) {

		return findBygetQuarryById(quarryApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findBygetQuarryById(
		String quarryApplicationId, int start, int end,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		return findBygetQuarryById(
			quarryApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findBygetQuarryById(
		String quarryApplicationId, int start, int end,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator,
		boolean useFinderCache) {

		quarryApplicationId = Objects.toString(quarryApplicationId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetQuarryById;
				finderArgs = new Object[] {quarryApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarryById;
			finderArgs = new Object[] {
				quarryApplicationId, start, end, orderByComparator
			};
		}

		List<MaterialInformationMachinesAndEquipent> list = null;

		if (useFinderCache) {
			list =
				(List<MaterialInformationMachinesAndEquipent>)
					finderCache.getResult(finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (MaterialInformationMachinesAndEquipent
						materialInformationMachinesAndEquipent : list) {

					if (!quarryApplicationId.equals(
							materialInformationMachinesAndEquipent.
								getQuarryApplicationId())) {

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

			sb.append(_SQL_SELECT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE);

			boolean bindQuarryApplicationId = false;

			if (quarryApplicationId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_3);
			}
			else {
				bindQuarryApplicationId = true;

				sb.append(_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					MaterialInformationMachinesAndEquipentModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindQuarryApplicationId) {
					queryPos.add(quarryApplicationId);
				}

				list =
					(List<MaterialInformationMachinesAndEquipent>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent findBygetQuarryById_First(
			String quarryApplicationId,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent = fetchBygetQuarryById_First(
				quarryApplicationId, orderByComparator);

		if (materialInformationMachinesAndEquipent != null) {
			return materialInformationMachinesAndEquipent;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append("}");

		throw new NoSuchMaterialInformationMachinesAndEquipentException(
			sb.toString());
	}

	/**
	 * Returns the first material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent fetchBygetQuarryById_First(
		String quarryApplicationId,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		List<MaterialInformationMachinesAndEquipent> list = findBygetQuarryById(
			quarryApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent findBygetQuarryById_Last(
			String quarryApplicationId,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent = fetchBygetQuarryById_Last(
				quarryApplicationId, orderByComparator);

		if (materialInformationMachinesAndEquipent != null) {
			return materialInformationMachinesAndEquipent;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append("}");

		throw new NoSuchMaterialInformationMachinesAndEquipentException(
			sb.toString());
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent fetchBygetQuarryById_Last(
		String quarryApplicationId,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		int count = countBygetQuarryById(quarryApplicationId);

		if (count == 0) {
			return null;
		}

		List<MaterialInformationMachinesAndEquipent> list = findBygetQuarryById(
			quarryApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the material information machines and equipents before and after the current material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param miMachineId the primary key of the current material information machines and equipent
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent[]
			findBygetQuarryById_PrevAndNext(
				long miMachineId, String quarryApplicationId,
				OrderByComparator<MaterialInformationMachinesAndEquipent>
					orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		quarryApplicationId = Objects.toString(quarryApplicationId, "");

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent = findByPrimaryKey(
				miMachineId);

		Session session = null;

		try {
			session = openSession();

			MaterialInformationMachinesAndEquipent[] array =
				new MaterialInformationMachinesAndEquipentImpl[3];

			array[0] = getBygetQuarryById_PrevAndNext(
				session, materialInformationMachinesAndEquipent,
				quarryApplicationId, orderByComparator, true);

			array[1] = materialInformationMachinesAndEquipent;

			array[2] = getBygetQuarryById_PrevAndNext(
				session, materialInformationMachinesAndEquipent,
				quarryApplicationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MaterialInformationMachinesAndEquipent
		getBygetQuarryById_PrevAndNext(
			Session session,
			MaterialInformationMachinesAndEquipent
				materialInformationMachinesAndEquipent,
			String quarryApplicationId,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator,
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

		sb.append(_SQL_SELECT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE);

		boolean bindQuarryApplicationId = false;

		if (quarryApplicationId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_3);
		}
		else {
			bindQuarryApplicationId = true;

			sb.append(_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_2);
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
			sb.append(
				MaterialInformationMachinesAndEquipentModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindQuarryApplicationId) {
			queryPos.add(quarryApplicationId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						materialInformationMachinesAndEquipent)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MaterialInformationMachinesAndEquipent> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the material information machines and equipents where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	@Override
	public void removeBygetQuarryById(String quarryApplicationId) {
		for (MaterialInformationMachinesAndEquipent
				materialInformationMachinesAndEquipent :
					findBygetQuarryById(
						quarryApplicationId, QueryUtil.ALL_POS,
						QueryUtil.ALL_POS, null)) {

			remove(materialInformationMachinesAndEquipent);
		}
	}

	/**
	 * Returns the number of material information machines and equipents where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching material information machines and equipents
	 */
	@Override
	public int countBygetQuarryById(String quarryApplicationId) {
		quarryApplicationId = Objects.toString(quarryApplicationId, "");

		FinderPath finderPath = _finderPathCountBygetQuarryById;

		Object[] finderArgs = new Object[] {quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE);

			boolean bindQuarryApplicationId = false;

			if (quarryApplicationId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_3);
			}
			else {
				bindQuarryApplicationId = true;

				sb.append(_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindQuarryApplicationId) {
					queryPos.add(quarryApplicationId);
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
		_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_2 =
			"materialInformationMachinesAndEquipent.quarryApplicationId = ?";

	private static final String
		_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_3 =
			"(materialInformationMachinesAndEquipent.quarryApplicationId IS NULL OR materialInformationMachinesAndEquipent.quarryApplicationId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetMaterialInfoMachineEquipment_By_MachineName_AppId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMaterialInfoMachineEquipment_By_MachineName_AppId;
	private FinderPath
		_finderPathCountBygetMaterialInfoMachineEquipment_By_MachineName_AppId;

	/**
	 * Returns all the material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @return the matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent>
		findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName) {

		return findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			quarryApplicationId, manchineName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @return the range of matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent>
		findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start,
			int end) {

		return findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			quarryApplicationId, manchineName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent>
		findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start, int end,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator) {

		return findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			quarryApplicationId, manchineName, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent>
		findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start, int end,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator,
			boolean useFinderCache) {

		quarryApplicationId = Objects.toString(quarryApplicationId, "");
		manchineName = Objects.toString(manchineName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMaterialInfoMachineEquipment_By_MachineName_AppId;
				finderArgs = new Object[] {quarryApplicationId, manchineName};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetMaterialInfoMachineEquipment_By_MachineName_AppId;
			finderArgs = new Object[] {
				quarryApplicationId, manchineName, start, end, orderByComparator
			};
		}

		List<MaterialInformationMachinesAndEquipent> list = null;

		if (useFinderCache) {
			list =
				(List<MaterialInformationMachinesAndEquipent>)
					finderCache.getResult(finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (MaterialInformationMachinesAndEquipent
						materialInformationMachinesAndEquipent : list) {

					if (!quarryApplicationId.equals(
							materialInformationMachinesAndEquipent.
								getQuarryApplicationId()) ||
						!manchineName.equals(
							materialInformationMachinesAndEquipent.
								getManchineName())) {

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

			sb.append(_SQL_SELECT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE);

			boolean bindQuarryApplicationId = false;

			if (quarryApplicationId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_3);
			}
			else {
				bindQuarryApplicationId = true;

				sb.append(
					_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_2);
			}

			boolean bindManchineName = false;

			if (manchineName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_3);
			}
			else {
				bindManchineName = true;

				sb.append(
					_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					MaterialInformationMachinesAndEquipentModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindQuarryApplicationId) {
					queryPos.add(quarryApplicationId);
				}

				if (bindManchineName) {
					queryPos.add(manchineName);
				}

				list =
					(List<MaterialInformationMachinesAndEquipent>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first material information machines and equipent in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId_First(
				String quarryApplicationId, String manchineName,
				OrderByComparator<MaterialInformationMachinesAndEquipent>
					orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent =
				fetchBygetMaterialInfoMachineEquipment_By_MachineName_AppId_First(
					quarryApplicationId, manchineName, orderByComparator);

		if (materialInformationMachinesAndEquipent != null) {
			return materialInformationMachinesAndEquipent;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append(", manchineName=");
		sb.append(manchineName);

		sb.append("}");

		throw new NoSuchMaterialInformationMachinesAndEquipentException(
			sb.toString());
	}

	/**
	 * Returns the first material information machines and equipent in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent
		fetchBygetMaterialInfoMachineEquipment_By_MachineName_AppId_First(
			String quarryApplicationId, String manchineName,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator) {

		List<MaterialInformationMachinesAndEquipent> list =
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId_Last(
				String quarryApplicationId, String manchineName,
				OrderByComparator<MaterialInformationMachinesAndEquipent>
					orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent =
				fetchBygetMaterialInfoMachineEquipment_By_MachineName_AppId_Last(
					quarryApplicationId, manchineName, orderByComparator);

		if (materialInformationMachinesAndEquipent != null) {
			return materialInformationMachinesAndEquipent;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append(", manchineName=");
		sb.append(manchineName);

		sb.append("}");

		throw new NoSuchMaterialInformationMachinesAndEquipentException(
			sb.toString());
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent
		fetchBygetMaterialInfoMachineEquipment_By_MachineName_AppId_Last(
			String quarryApplicationId, String manchineName,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator) {

		int count = countBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			quarryApplicationId, manchineName);

		if (count == 0) {
			return null;
		}

		List<MaterialInformationMachinesAndEquipent> list =
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the material information machines and equipents before and after the current material information machines and equipent in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param miMachineId the primary key of the current material information machines and equipent
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent[]
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId_PrevAndNext(
				long miMachineId, String quarryApplicationId,
				String manchineName,
				OrderByComparator<MaterialInformationMachinesAndEquipent>
					orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		quarryApplicationId = Objects.toString(quarryApplicationId, "");
		manchineName = Objects.toString(manchineName, "");

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent = findByPrimaryKey(
				miMachineId);

		Session session = null;

		try {
			session = openSession();

			MaterialInformationMachinesAndEquipent[] array =
				new MaterialInformationMachinesAndEquipentImpl[3];

			array[0] =
				getBygetMaterialInfoMachineEquipment_By_MachineName_AppId_PrevAndNext(
					session, materialInformationMachinesAndEquipent,
					quarryApplicationId, manchineName, orderByComparator, true);

			array[1] = materialInformationMachinesAndEquipent;

			array[2] =
				getBygetMaterialInfoMachineEquipment_By_MachineName_AppId_PrevAndNext(
					session, materialInformationMachinesAndEquipent,
					quarryApplicationId, manchineName, orderByComparator,
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

	protected MaterialInformationMachinesAndEquipent
		getBygetMaterialInfoMachineEquipment_By_MachineName_AppId_PrevAndNext(
			Session session,
			MaterialInformationMachinesAndEquipent
				materialInformationMachinesAndEquipent,
			String quarryApplicationId, String manchineName,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator,
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

		sb.append(_SQL_SELECT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE);

		boolean bindQuarryApplicationId = false;

		if (quarryApplicationId.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_3);
		}
		else {
			bindQuarryApplicationId = true;

			sb.append(
				_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_2);
		}

		boolean bindManchineName = false;

		if (manchineName.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_3);
		}
		else {
			bindManchineName = true;

			sb.append(
				_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_2);
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
			sb.append(
				MaterialInformationMachinesAndEquipentModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindQuarryApplicationId) {
			queryPos.add(quarryApplicationId);
		}

		if (bindManchineName) {
			queryPos.add(manchineName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						materialInformationMachinesAndEquipent)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MaterialInformationMachinesAndEquipent> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 */
	@Override
	public void removeBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
		String quarryApplicationId, String manchineName) {

		for (MaterialInformationMachinesAndEquipent
				materialInformationMachinesAndEquipent :
					findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
						quarryApplicationId, manchineName, QueryUtil.ALL_POS,
						QueryUtil.ALL_POS, null)) {

			remove(materialInformationMachinesAndEquipent);
		}
	}

	/**
	 * Returns the number of material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @return the number of matching material information machines and equipents
	 */
	@Override
	public int countBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
		String quarryApplicationId, String manchineName) {

		quarryApplicationId = Objects.toString(quarryApplicationId, "");
		manchineName = Objects.toString(manchineName, "");

		FinderPath finderPath =
			_finderPathCountBygetMaterialInfoMachineEquipment_By_MachineName_AppId;

		Object[] finderArgs = new Object[] {quarryApplicationId, manchineName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE);

			boolean bindQuarryApplicationId = false;

			if (quarryApplicationId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_3);
			}
			else {
				bindQuarryApplicationId = true;

				sb.append(
					_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_2);
			}

			boolean bindManchineName = false;

			if (manchineName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_3);
			}
			else {
				bindManchineName = true;

				sb.append(
					_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindQuarryApplicationId) {
					queryPos.add(quarryApplicationId);
				}

				if (bindManchineName) {
					queryPos.add(manchineName);
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
		_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_2 =
			"materialInformationMachinesAndEquipent.quarryApplicationId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_3 =
			"(materialInformationMachinesAndEquipent.quarryApplicationId IS NULL OR materialInformationMachinesAndEquipent.quarryApplicationId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_2 =
			"materialInformationMachinesAndEquipent.manchineName = ?";

	private static final String
		_FINDER_COLUMN_GETMATERIALINFOMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_3 =
			"(materialInformationMachinesAndEquipent.manchineName IS NULL OR materialInformationMachinesAndEquipent.manchineName = '')";

	public MaterialInformationMachinesAndEquipentPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MaterialInformationMachinesAndEquipent.class);

		setModelImplClass(MaterialInformationMachinesAndEquipentImpl.class);
		setModelPKClass(long.class);

		setTable(MaterialInformationMachinesAndEquipentTable.INSTANCE);
	}

	/**
	 * Caches the material information machines and equipent in the entity cache if it is enabled.
	 *
	 * @param materialInformationMachinesAndEquipent the material information machines and equipent
	 */
	@Override
	public void cacheResult(
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent) {

		entityCache.putResult(
			MaterialInformationMachinesAndEquipentImpl.class,
			materialInformationMachinesAndEquipent.getPrimaryKey(),
			materialInformationMachinesAndEquipent);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				materialInformationMachinesAndEquipent.getUuid(),
				materialInformationMachinesAndEquipent.getGroupId()
			},
			materialInformationMachinesAndEquipent);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the material information machines and equipents in the entity cache if it is enabled.
	 *
	 * @param materialInformationMachinesAndEquipents the material information machines and equipents
	 */
	@Override
	public void cacheResult(
		List<MaterialInformationMachinesAndEquipent>
			materialInformationMachinesAndEquipents) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (materialInformationMachinesAndEquipents.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MaterialInformationMachinesAndEquipent
				materialInformationMachinesAndEquipent :
					materialInformationMachinesAndEquipents) {

			if (entityCache.getResult(
					MaterialInformationMachinesAndEquipentImpl.class,
					materialInformationMachinesAndEquipent.getPrimaryKey()) ==
						null) {

				cacheResult(materialInformationMachinesAndEquipent);
			}
		}
	}

	/**
	 * Clears the cache for all material information machines and equipents.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(
			MaterialInformationMachinesAndEquipentImpl.class);

		finderCache.clearCache(
			MaterialInformationMachinesAndEquipentImpl.class);
	}

	/**
	 * Clears the cache for the material information machines and equipent.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent) {

		entityCache.removeResult(
			MaterialInformationMachinesAndEquipentImpl.class,
			materialInformationMachinesAndEquipent);
	}

	@Override
	public void clearCache(
		List<MaterialInformationMachinesAndEquipent>
			materialInformationMachinesAndEquipents) {

		for (MaterialInformationMachinesAndEquipent
				materialInformationMachinesAndEquipent :
					materialInformationMachinesAndEquipents) {

			entityCache.removeResult(
				MaterialInformationMachinesAndEquipentImpl.class,
				materialInformationMachinesAndEquipent);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(
			MaterialInformationMachinesAndEquipentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MaterialInformationMachinesAndEquipentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MaterialInformationMachinesAndEquipentModelImpl
			materialInformationMachinesAndEquipentModelImpl) {

		Object[] args = new Object[] {
			materialInformationMachinesAndEquipentModelImpl.getUuid(),
			materialInformationMachinesAndEquipentModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			materialInformationMachinesAndEquipentModelImpl);
	}

	/**
	 * Creates a new material information machines and equipent with the primary key. Does not add the material information machines and equipent to the database.
	 *
	 * @param miMachineId the primary key for the new material information machines and equipent
	 * @return the new material information machines and equipent
	 */
	@Override
	public MaterialInformationMachinesAndEquipent create(long miMachineId) {
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent =
				new MaterialInformationMachinesAndEquipentImpl();

		materialInformationMachinesAndEquipent.setNew(true);
		materialInformationMachinesAndEquipent.setPrimaryKey(miMachineId);

		String uuid = PortalUUIDUtil.generate();

		materialInformationMachinesAndEquipent.setUuid(uuid);

		materialInformationMachinesAndEquipent.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return materialInformationMachinesAndEquipent;
	}

	/**
	 * Removes the material information machines and equipent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miMachineId the primary key of the material information machines and equipent
	 * @return the material information machines and equipent that was removed
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent remove(long miMachineId)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		return remove((Serializable)miMachineId);
	}

	/**
	 * Removes the material information machines and equipent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the material information machines and equipent
	 * @return the material information machines and equipent that was removed
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent remove(
			Serializable primaryKey)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		Session session = null;

		try {
			session = openSession();

			MaterialInformationMachinesAndEquipent
				materialInformationMachinesAndEquipent =
					(MaterialInformationMachinesAndEquipent)session.get(
						MaterialInformationMachinesAndEquipentImpl.class,
						primaryKey);

			if (materialInformationMachinesAndEquipent == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMaterialInformationMachinesAndEquipentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(materialInformationMachinesAndEquipent);
		}
		catch (NoSuchMaterialInformationMachinesAndEquipentException
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
	protected MaterialInformationMachinesAndEquipent removeImpl(
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(materialInformationMachinesAndEquipent)) {
				materialInformationMachinesAndEquipent =
					(MaterialInformationMachinesAndEquipent)session.get(
						MaterialInformationMachinesAndEquipentImpl.class,
						materialInformationMachinesAndEquipent.
							getPrimaryKeyObj());
			}

			if (materialInformationMachinesAndEquipent != null) {
				session.delete(materialInformationMachinesAndEquipent);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (materialInformationMachinesAndEquipent != null) {
			clearCache(materialInformationMachinesAndEquipent);
		}

		return materialInformationMachinesAndEquipent;
	}

	@Override
	public MaterialInformationMachinesAndEquipent updateImpl(
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent) {

		boolean isNew = materialInformationMachinesAndEquipent.isNew();

		if (!(materialInformationMachinesAndEquipent instanceof
				MaterialInformationMachinesAndEquipentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					materialInformationMachinesAndEquipent.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					materialInformationMachinesAndEquipent);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in materialInformationMachinesAndEquipent proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MaterialInformationMachinesAndEquipent implementation " +
					materialInformationMachinesAndEquipent.getClass());
		}

		MaterialInformationMachinesAndEquipentModelImpl
			materialInformationMachinesAndEquipentModelImpl =
				(MaterialInformationMachinesAndEquipentModelImpl)
					materialInformationMachinesAndEquipent;

		if (Validator.isNull(
				materialInformationMachinesAndEquipent.getUuid())) {

			String uuid = PortalUUIDUtil.generate();

			materialInformationMachinesAndEquipent.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(materialInformationMachinesAndEquipent.getCreateDate() == null)) {

			if (serviceContext == null) {
				materialInformationMachinesAndEquipent.setCreateDate(date);
			}
			else {
				materialInformationMachinesAndEquipent.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!materialInformationMachinesAndEquipentModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				materialInformationMachinesAndEquipent.setModifiedDate(date);
			}
			else {
				materialInformationMachinesAndEquipent.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(materialInformationMachinesAndEquipent);
			}
			else {
				materialInformationMachinesAndEquipent =
					(MaterialInformationMachinesAndEquipent)session.merge(
						materialInformationMachinesAndEquipent);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MaterialInformationMachinesAndEquipentImpl.class,
			materialInformationMachinesAndEquipentModelImpl, false, true);

		cacheUniqueFindersCache(
			materialInformationMachinesAndEquipentModelImpl);

		if (isNew) {
			materialInformationMachinesAndEquipent.setNew(false);
		}

		materialInformationMachinesAndEquipent.resetOriginalValues();

		return materialInformationMachinesAndEquipent;
	}

	/**
	 * Returns the material information machines and equipent with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the material information machines and equipent
	 * @return the material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent = fetchByPrimaryKey(
				primaryKey);

		if (materialInformationMachinesAndEquipent == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMaterialInformationMachinesAndEquipentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return materialInformationMachinesAndEquipent;
	}

	/**
	 * Returns the material information machines and equipent with the primary key or throws a <code>NoSuchMaterialInformationMachinesAndEquipentException</code> if it could not be found.
	 *
	 * @param miMachineId the primary key of the material information machines and equipent
	 * @return the material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent findByPrimaryKey(
			long miMachineId)
		throws NoSuchMaterialInformationMachinesAndEquipentException {

		return findByPrimaryKey((Serializable)miMachineId);
	}

	/**
	 * Returns the material information machines and equipent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miMachineId the primary key of the material information machines and equipent
	 * @return the material information machines and equipent, or <code>null</code> if a material information machines and equipent with the primary key could not be found
	 */
	@Override
	public MaterialInformationMachinesAndEquipent fetchByPrimaryKey(
		long miMachineId) {

		return fetchByPrimaryKey((Serializable)miMachineId);
	}

	/**
	 * Returns all the material information machines and equipents.
	 *
	 * @return the material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the material information machines and equipents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @return the range of material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findAll(
		int start, int end,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of material information machines and equipents
	 */
	@Override
	public List<MaterialInformationMachinesAndEquipent> findAll(
		int start, int end,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator,
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

		List<MaterialInformationMachinesAndEquipent> list = null;

		if (useFinderCache) {
			list =
				(List<MaterialInformationMachinesAndEquipent>)
					finderCache.getResult(finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MATERIALINFORMATIONMACHINESANDEQUIPENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MATERIALINFORMATIONMACHINESANDEQUIPENT;

				sql = sql.concat(
					MaterialInformationMachinesAndEquipentModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<MaterialInformationMachinesAndEquipent>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Removes all the material information machines and equipents from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MaterialInformationMachinesAndEquipent
				materialInformationMachinesAndEquipent : findAll()) {

			remove(materialInformationMachinesAndEquipent);
		}
	}

	/**
	 * Returns the number of material information machines and equipents.
	 *
	 * @return the number of material information machines and equipents
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_MATERIALINFORMATIONMACHINESANDEQUIPENT);

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
		return "miMachineId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MATERIALINFORMATIONMACHINESANDEQUIPENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MaterialInformationMachinesAndEquipentModelImpl.
			TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the material information machines and equipent persistence.
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

		_finderPathWithPaginationFindBygetQuarryById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetQuarryById",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"quarryApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetQuarryById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetQuarryById",
			new String[] {String.class.getName()},
			new String[] {"quarryApplicationId"}, true);

		_finderPathCountBygetQuarryById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetQuarryById",
			new String[] {String.class.getName()},
			new String[] {"quarryApplicationId"}, false);

		_finderPathWithPaginationFindBygetMaterialInfoMachineEquipment_By_MachineName_AppId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetMaterialInfoMachineEquipment_By_MachineName_AppId",
				new String[] {
					String.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"quarryApplicationId", "manchineName"}, true);

		_finderPathWithoutPaginationFindBygetMaterialInfoMachineEquipment_By_MachineName_AppId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMaterialInfoMachineEquipment_By_MachineName_AppId",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"quarryApplicationId", "manchineName"}, true);

		_finderPathCountBygetMaterialInfoMachineEquipment_By_MachineName_AppId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetMaterialInfoMachineEquipment_By_MachineName_AppId",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"quarryApplicationId", "manchineName"}, false);

		_setMaterialInformationMachinesAndEquipentUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setMaterialInformationMachinesAndEquipentUtilPersistence(null);

		entityCache.removeCache(
			MaterialInformationMachinesAndEquipentImpl.class.getName());
	}

	private void _setMaterialInformationMachinesAndEquipentUtilPersistence(
		MaterialInformationMachinesAndEquipentPersistence
			materialInformationMachinesAndEquipentPersistence) {

		try {
			Field field =
				MaterialInformationMachinesAndEquipentUtil.class.
					getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, materialInformationMachinesAndEquipentPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String
		_SQL_SELECT_MATERIALINFORMATIONMACHINESANDEQUIPENT =
			"SELECT materialInformationMachinesAndEquipent FROM MaterialInformationMachinesAndEquipent materialInformationMachinesAndEquipent";

	private static final String
		_SQL_SELECT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE =
			"SELECT materialInformationMachinesAndEquipent FROM MaterialInformationMachinesAndEquipent materialInformationMachinesAndEquipent WHERE ";

	private static final String
		_SQL_COUNT_MATERIALINFORMATIONMACHINESANDEQUIPENT =
			"SELECT COUNT(materialInformationMachinesAndEquipent) FROM MaterialInformationMachinesAndEquipent materialInformationMachinesAndEquipent";

	private static final String
		_SQL_COUNT_MATERIALINFORMATIONMACHINESANDEQUIPENT_WHERE =
			"SELECT COUNT(materialInformationMachinesAndEquipent) FROM MaterialInformationMachinesAndEquipent materialInformationMachinesAndEquipent WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"materialInformationMachinesAndEquipent.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MaterialInformationMachinesAndEquipent exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MaterialInformationMachinesAndEquipent exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MaterialInformationMachinesAndEquipentPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private MaterialInformationMachinesAndEquipentModelArgumentsResolver
		_materialInformationMachinesAndEquipentModelArgumentsResolver;

}