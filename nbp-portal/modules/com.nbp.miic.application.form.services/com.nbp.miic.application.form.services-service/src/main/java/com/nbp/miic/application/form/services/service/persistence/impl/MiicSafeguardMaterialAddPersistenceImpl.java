/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence.impl;

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

import com.nbp.miic.application.form.services.exception.NoSuchMiicSafeguardMaterialAddException;
import com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd;
import com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAddTable;
import com.nbp.miic.application.form.services.model.impl.MiicSafeguardMaterialAddImpl;
import com.nbp.miic.application.form.services.model.impl.MiicSafeguardMaterialAddModelImpl;
import com.nbp.miic.application.form.services.service.persistence.MiicSafeguardMaterialAddPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicSafeguardMaterialAddUtil;
import com.nbp.miic.application.form.services.service.persistence.impl.constants.MIIC_SERVICESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the miic safeguard material add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiicSafeguardMaterialAddPersistence.class)
public class MiicSafeguardMaterialAddPersistenceImpl
	extends BasePersistenceImpl<MiicSafeguardMaterialAdd>
	implements MiicSafeguardMaterialAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiicSafeguardMaterialAddUtil</code> to access the miic safeguard material add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiicSafeguardMaterialAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetMiicById;
	private FinderPath _finderPathWithoutPaginationFindBygetMiicById;
	private FinderPath _finderPathCountBygetMiicById;

	/**
	 * Returns all the miic safeguard material adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic safeguard material adds
	 */
	@Override
	public List<MiicSafeguardMaterialAdd> findBygetMiicById(
		long miicApplicationId) {

		return findBygetMiicById(
			miicApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic safeguard material adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @return the range of matching miic safeguard material adds
	 */
	@Override
	public List<MiicSafeguardMaterialAdd> findBygetMiicById(
		long miicApplicationId, int start, int end) {

		return findBygetMiicById(miicApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic safeguard material adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic safeguard material adds
	 */
	@Override
	public List<MiicSafeguardMaterialAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		OrderByComparator<MiicSafeguardMaterialAdd> orderByComparator) {

		return findBygetMiicById(
			miicApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic safeguard material adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic safeguard material adds
	 */
	@Override
	public List<MiicSafeguardMaterialAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		OrderByComparator<MiicSafeguardMaterialAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMiicById;
				finderArgs = new Object[] {miicApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMiicById;
			finderArgs = new Object[] {
				miicApplicationId, start, end, orderByComparator
			};
		}

		List<MiicSafeguardMaterialAdd> list = null;

		if (useFinderCache) {
			list = (List<MiicSafeguardMaterialAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiicSafeguardMaterialAdd miicSafeguardMaterialAdd : list) {
					if (miicApplicationId !=
							miicSafeguardMaterialAdd.getMiicApplicationId()) {

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

			sb.append(_SQL_SELECT_MIICSAFEGUARDMATERIALADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiicSafeguardMaterialAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

				list = (List<MiicSafeguardMaterialAdd>)QueryUtil.list(
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
	 * Returns the first miic safeguard material add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic safeguard material add
	 * @throws NoSuchMiicSafeguardMaterialAddException if a matching miic safeguard material add could not be found
	 */
	@Override
	public MiicSafeguardMaterialAdd findBygetMiicById_First(
			long miicApplicationId,
			OrderByComparator<MiicSafeguardMaterialAdd> orderByComparator)
		throws NoSuchMiicSafeguardMaterialAddException {

		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd =
			fetchBygetMiicById_First(miicApplicationId, orderByComparator);

		if (miicSafeguardMaterialAdd != null) {
			return miicSafeguardMaterialAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("miicApplicationId=");
		sb.append(miicApplicationId);

		sb.append("}");

		throw new NoSuchMiicSafeguardMaterialAddException(sb.toString());
	}

	/**
	 * Returns the first miic safeguard material add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic safeguard material add, or <code>null</code> if a matching miic safeguard material add could not be found
	 */
	@Override
	public MiicSafeguardMaterialAdd fetchBygetMiicById_First(
		long miicApplicationId,
		OrderByComparator<MiicSafeguardMaterialAdd> orderByComparator) {

		List<MiicSafeguardMaterialAdd> list = findBygetMiicById(
			miicApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last miic safeguard material add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic safeguard material add
	 * @throws NoSuchMiicSafeguardMaterialAddException if a matching miic safeguard material add could not be found
	 */
	@Override
	public MiicSafeguardMaterialAdd findBygetMiicById_Last(
			long miicApplicationId,
			OrderByComparator<MiicSafeguardMaterialAdd> orderByComparator)
		throws NoSuchMiicSafeguardMaterialAddException {

		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd =
			fetchBygetMiicById_Last(miicApplicationId, orderByComparator);

		if (miicSafeguardMaterialAdd != null) {
			return miicSafeguardMaterialAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("miicApplicationId=");
		sb.append(miicApplicationId);

		sb.append("}");

		throw new NoSuchMiicSafeguardMaterialAddException(sb.toString());
	}

	/**
	 * Returns the last miic safeguard material add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic safeguard material add, or <code>null</code> if a matching miic safeguard material add could not be found
	 */
	@Override
	public MiicSafeguardMaterialAdd fetchBygetMiicById_Last(
		long miicApplicationId,
		OrderByComparator<MiicSafeguardMaterialAdd> orderByComparator) {

		int count = countBygetMiicById(miicApplicationId);

		if (count == 0) {
			return null;
		}

		List<MiicSafeguardMaterialAdd> list = findBygetMiicById(
			miicApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the miic safeguard material adds before and after the current miic safeguard material add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicSafeguardMaterialAddId the primary key of the current miic safeguard material add
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic safeguard material add
	 * @throws NoSuchMiicSafeguardMaterialAddException if a miic safeguard material add with the primary key could not be found
	 */
	@Override
	public MiicSafeguardMaterialAdd[] findBygetMiicById_PrevAndNext(
			long miicSafeguardMaterialAddId, long miicApplicationId,
			OrderByComparator<MiicSafeguardMaterialAdd> orderByComparator)
		throws NoSuchMiicSafeguardMaterialAddException {

		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd = findByPrimaryKey(
			miicSafeguardMaterialAddId);

		Session session = null;

		try {
			session = openSession();

			MiicSafeguardMaterialAdd[] array =
				new MiicSafeguardMaterialAddImpl[3];

			array[0] = getBygetMiicById_PrevAndNext(
				session, miicSafeguardMaterialAdd, miicApplicationId,
				orderByComparator, true);

			array[1] = miicSafeguardMaterialAdd;

			array[2] = getBygetMiicById_PrevAndNext(
				session, miicSafeguardMaterialAdd, miicApplicationId,
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

	protected MiicSafeguardMaterialAdd getBygetMiicById_PrevAndNext(
		Session session, MiicSafeguardMaterialAdd miicSafeguardMaterialAdd,
		long miicApplicationId,
		OrderByComparator<MiicSafeguardMaterialAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_MIICSAFEGUARDMATERIALADD_WHERE);

		sb.append(_FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2);

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
			sb.append(MiicSafeguardMaterialAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(miicApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						miicSafeguardMaterialAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiicSafeguardMaterialAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the miic safeguard material adds where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 */
	@Override
	public void removeBygetMiicById(long miicApplicationId) {
		for (MiicSafeguardMaterialAdd miicSafeguardMaterialAdd :
				findBygetMiicById(
					miicApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(miicSafeguardMaterialAdd);
		}
	}

	/**
	 * Returns the number of miic safeguard material adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic safeguard material adds
	 */
	@Override
	public int countBygetMiicById(long miicApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMiicById;

		Object[] finderArgs = new Object[] {miicApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICSAFEGUARDMATERIALADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

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

	private static final String _FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2 =
		"miicSafeguardMaterialAdd.miicApplicationId = ?";

	public MiicSafeguardMaterialAddPersistenceImpl() {
		setModelClass(MiicSafeguardMaterialAdd.class);

		setModelImplClass(MiicSafeguardMaterialAddImpl.class);
		setModelPKClass(long.class);

		setTable(MiicSafeguardMaterialAddTable.INSTANCE);
	}

	/**
	 * Caches the miic safeguard material add in the entity cache if it is enabled.
	 *
	 * @param miicSafeguardMaterialAdd the miic safeguard material add
	 */
	@Override
	public void cacheResult(MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {
		entityCache.putResult(
			MiicSafeguardMaterialAddImpl.class,
			miicSafeguardMaterialAdd.getPrimaryKey(), miicSafeguardMaterialAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the miic safeguard material adds in the entity cache if it is enabled.
	 *
	 * @param miicSafeguardMaterialAdds the miic safeguard material adds
	 */
	@Override
	public void cacheResult(
		List<MiicSafeguardMaterialAdd> miicSafeguardMaterialAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miicSafeguardMaterialAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiicSafeguardMaterialAdd miicSafeguardMaterialAdd :
				miicSafeguardMaterialAdds) {

			if (entityCache.getResult(
					MiicSafeguardMaterialAddImpl.class,
					miicSafeguardMaterialAdd.getPrimaryKey()) == null) {

				cacheResult(miicSafeguardMaterialAdd);
			}
		}
	}

	/**
	 * Clears the cache for all miic safeguard material adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiicSafeguardMaterialAddImpl.class);

		finderCache.clearCache(MiicSafeguardMaterialAddImpl.class);
	}

	/**
	 * Clears the cache for the miic safeguard material add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {
		entityCache.removeResult(
			MiicSafeguardMaterialAddImpl.class, miicSafeguardMaterialAdd);
	}

	@Override
	public void clearCache(
		List<MiicSafeguardMaterialAdd> miicSafeguardMaterialAdds) {

		for (MiicSafeguardMaterialAdd miicSafeguardMaterialAdd :
				miicSafeguardMaterialAdds) {

			entityCache.removeResult(
				MiicSafeguardMaterialAddImpl.class, miicSafeguardMaterialAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiicSafeguardMaterialAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiicSafeguardMaterialAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new miic safeguard material add with the primary key. Does not add the miic safeguard material add to the database.
	 *
	 * @param miicSafeguardMaterialAddId the primary key for the new miic safeguard material add
	 * @return the new miic safeguard material add
	 */
	@Override
	public MiicSafeguardMaterialAdd create(long miicSafeguardMaterialAddId) {
		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd =
			new MiicSafeguardMaterialAddImpl();

		miicSafeguardMaterialAdd.setNew(true);
		miicSafeguardMaterialAdd.setPrimaryKey(miicSafeguardMaterialAddId);

		miicSafeguardMaterialAdd.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return miicSafeguardMaterialAdd;
	}

	/**
	 * Removes the miic safeguard material add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicSafeguardMaterialAddId the primary key of the miic safeguard material add
	 * @return the miic safeguard material add that was removed
	 * @throws NoSuchMiicSafeguardMaterialAddException if a miic safeguard material add with the primary key could not be found
	 */
	@Override
	public MiicSafeguardMaterialAdd remove(long miicSafeguardMaterialAddId)
		throws NoSuchMiicSafeguardMaterialAddException {

		return remove((Serializable)miicSafeguardMaterialAddId);
	}

	/**
	 * Removes the miic safeguard material add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the miic safeguard material add
	 * @return the miic safeguard material add that was removed
	 * @throws NoSuchMiicSafeguardMaterialAddException if a miic safeguard material add with the primary key could not be found
	 */
	@Override
	public MiicSafeguardMaterialAdd remove(Serializable primaryKey)
		throws NoSuchMiicSafeguardMaterialAddException {

		Session session = null;

		try {
			session = openSession();

			MiicSafeguardMaterialAdd miicSafeguardMaterialAdd =
				(MiicSafeguardMaterialAdd)session.get(
					MiicSafeguardMaterialAddImpl.class, primaryKey);

			if (miicSafeguardMaterialAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiicSafeguardMaterialAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miicSafeguardMaterialAdd);
		}
		catch (NoSuchMiicSafeguardMaterialAddException noSuchEntityException) {
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
	protected MiicSafeguardMaterialAdd removeImpl(
		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miicSafeguardMaterialAdd)) {
				miicSafeguardMaterialAdd =
					(MiicSafeguardMaterialAdd)session.get(
						MiicSafeguardMaterialAddImpl.class,
						miicSafeguardMaterialAdd.getPrimaryKeyObj());
			}

			if (miicSafeguardMaterialAdd != null) {
				session.delete(miicSafeguardMaterialAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miicSafeguardMaterialAdd != null) {
			clearCache(miicSafeguardMaterialAdd);
		}

		return miicSafeguardMaterialAdd;
	}

	@Override
	public MiicSafeguardMaterialAdd updateImpl(
		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {

		boolean isNew = miicSafeguardMaterialAdd.isNew();

		if (!(miicSafeguardMaterialAdd instanceof
				MiicSafeguardMaterialAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miicSafeguardMaterialAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miicSafeguardMaterialAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miicSafeguardMaterialAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiicSafeguardMaterialAdd implementation " +
					miicSafeguardMaterialAdd.getClass());
		}

		MiicSafeguardMaterialAddModelImpl miicSafeguardMaterialAddModelImpl =
			(MiicSafeguardMaterialAddModelImpl)miicSafeguardMaterialAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miicSafeguardMaterialAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				miicSafeguardMaterialAdd.setCreateDate(date);
			}
			else {
				miicSafeguardMaterialAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miicSafeguardMaterialAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miicSafeguardMaterialAdd.setModifiedDate(date);
			}
			else {
				miicSafeguardMaterialAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miicSafeguardMaterialAdd);
			}
			else {
				miicSafeguardMaterialAdd =
					(MiicSafeguardMaterialAdd)session.merge(
						miicSafeguardMaterialAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiicSafeguardMaterialAddImpl.class,
			miicSafeguardMaterialAddModelImpl, false, true);

		if (isNew) {
			miicSafeguardMaterialAdd.setNew(false);
		}

		miicSafeguardMaterialAdd.resetOriginalValues();

		return miicSafeguardMaterialAdd;
	}

	/**
	 * Returns the miic safeguard material add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the miic safeguard material add
	 * @return the miic safeguard material add
	 * @throws NoSuchMiicSafeguardMaterialAddException if a miic safeguard material add with the primary key could not be found
	 */
	@Override
	public MiicSafeguardMaterialAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiicSafeguardMaterialAddException {

		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd = fetchByPrimaryKey(
			primaryKey);

		if (miicSafeguardMaterialAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiicSafeguardMaterialAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miicSafeguardMaterialAdd;
	}

	/**
	 * Returns the miic safeguard material add with the primary key or throws a <code>NoSuchMiicSafeguardMaterialAddException</code> if it could not be found.
	 *
	 * @param miicSafeguardMaterialAddId the primary key of the miic safeguard material add
	 * @return the miic safeguard material add
	 * @throws NoSuchMiicSafeguardMaterialAddException if a miic safeguard material add with the primary key could not be found
	 */
	@Override
	public MiicSafeguardMaterialAdd findByPrimaryKey(
			long miicSafeguardMaterialAddId)
		throws NoSuchMiicSafeguardMaterialAddException {

		return findByPrimaryKey((Serializable)miicSafeguardMaterialAddId);
	}

	/**
	 * Returns the miic safeguard material add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicSafeguardMaterialAddId the primary key of the miic safeguard material add
	 * @return the miic safeguard material add, or <code>null</code> if a miic safeguard material add with the primary key could not be found
	 */
	@Override
	public MiicSafeguardMaterialAdd fetchByPrimaryKey(
		long miicSafeguardMaterialAddId) {

		return fetchByPrimaryKey((Serializable)miicSafeguardMaterialAddId);
	}

	/**
	 * Returns all the miic safeguard material adds.
	 *
	 * @return the miic safeguard material adds
	 */
	@Override
	public List<MiicSafeguardMaterialAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic safeguard material adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @return the range of miic safeguard material adds
	 */
	@Override
	public List<MiicSafeguardMaterialAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic safeguard material adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic safeguard material adds
	 */
	@Override
	public List<MiicSafeguardMaterialAdd> findAll(
		int start, int end,
		OrderByComparator<MiicSafeguardMaterialAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic safeguard material adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic safeguard material adds
	 */
	@Override
	public List<MiicSafeguardMaterialAdd> findAll(
		int start, int end,
		OrderByComparator<MiicSafeguardMaterialAdd> orderByComparator,
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

		List<MiicSafeguardMaterialAdd> list = null;

		if (useFinderCache) {
			list = (List<MiicSafeguardMaterialAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MIICSAFEGUARDMATERIALADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MIICSAFEGUARDMATERIALADD;

				sql = sql.concat(
					MiicSafeguardMaterialAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiicSafeguardMaterialAdd>)QueryUtil.list(
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
	 * Removes all the miic safeguard material adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiicSafeguardMaterialAdd miicSafeguardMaterialAdd : findAll()) {
			remove(miicSafeguardMaterialAdd);
		}
	}

	/**
	 * Returns the number of miic safeguard material adds.
	 *
	 * @return the number of miic safeguard material adds
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
					_SQL_COUNT_MIICSAFEGUARDMATERIALADD);

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
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "miicSafeguardMaterialAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MIICSAFEGUARDMATERIALADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiicSafeguardMaterialAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the miic safeguard material add persistence.
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

		_finderPathWithPaginationFindBygetMiicById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMiicById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"miicApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMiicById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMiicById",
			new String[] {Long.class.getName()},
			new String[] {"miicApplicationId"}, true);

		_finderPathCountBygetMiicById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMiicById",
			new String[] {Long.class.getName()},
			new String[] {"miicApplicationId"}, false);

		MiicSafeguardMaterialAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiicSafeguardMaterialAddUtil.setPersistence(null);

		entityCache.removeCache(MiicSafeguardMaterialAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MIICSAFEGUARDMATERIALADD =
		"SELECT miicSafeguardMaterialAdd FROM MiicSafeguardMaterialAdd miicSafeguardMaterialAdd";

	private static final String _SQL_SELECT_MIICSAFEGUARDMATERIALADD_WHERE =
		"SELECT miicSafeguardMaterialAdd FROM MiicSafeguardMaterialAdd miicSafeguardMaterialAdd WHERE ";

	private static final String _SQL_COUNT_MIICSAFEGUARDMATERIALADD =
		"SELECT COUNT(miicSafeguardMaterialAdd) FROM MiicSafeguardMaterialAdd miicSafeguardMaterialAdd";

	private static final String _SQL_COUNT_MIICSAFEGUARDMATERIALADD_WHERE =
		"SELECT COUNT(miicSafeguardMaterialAdd) FROM MiicSafeguardMaterialAdd miicSafeguardMaterialAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miicSafeguardMaterialAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiicSafeguardMaterialAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiicSafeguardMaterialAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiicSafeguardMaterialAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}