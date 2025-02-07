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

import com.nbp.miic.application.form.services.exception.NoSuchMiicSafeguardGoodAddException;
import com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd;
import com.nbp.miic.application.form.services.model.MiicSafeguardGoodAddTable;
import com.nbp.miic.application.form.services.model.impl.MiicSafeguardGoodAddImpl;
import com.nbp.miic.application.form.services.model.impl.MiicSafeguardGoodAddModelImpl;
import com.nbp.miic.application.form.services.service.persistence.MiicSafeguardGoodAddPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicSafeguardGoodAddUtil;
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
 * The persistence implementation for the miic safeguard good add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiicSafeguardGoodAddPersistence.class)
public class MiicSafeguardGoodAddPersistenceImpl
	extends BasePersistenceImpl<MiicSafeguardGoodAdd>
	implements MiicSafeguardGoodAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiicSafeguardGoodAddUtil</code> to access the miic safeguard good add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiicSafeguardGoodAddImpl.class.getName();

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
	 * Returns all the miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic safeguard good adds
	 */
	@Override
	public List<MiicSafeguardGoodAdd> findBygetMiicById(
		long miicApplicationId) {

		return findBygetMiicById(
			miicApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @return the range of matching miic safeguard good adds
	 */
	@Override
	public List<MiicSafeguardGoodAdd> findBygetMiicById(
		long miicApplicationId, int start, int end) {

		return findBygetMiicById(miicApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic safeguard good adds
	 */
	@Override
	public List<MiicSafeguardGoodAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		OrderByComparator<MiicSafeguardGoodAdd> orderByComparator) {

		return findBygetMiicById(
			miicApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic safeguard good adds
	 */
	@Override
	public List<MiicSafeguardGoodAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		OrderByComparator<MiicSafeguardGoodAdd> orderByComparator,
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

		List<MiicSafeguardGoodAdd> list = null;

		if (useFinderCache) {
			list = (List<MiicSafeguardGoodAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiicSafeguardGoodAdd miicSafeguardGoodAdd : list) {
					if (miicApplicationId !=
							miicSafeguardGoodAdd.getMiicApplicationId()) {

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

			sb.append(_SQL_SELECT_MIICSAFEGUARDGOODADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiicSafeguardGoodAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

				list = (List<MiicSafeguardGoodAdd>)QueryUtil.list(
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
	 * Returns the first miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic safeguard good add
	 * @throws NoSuchMiicSafeguardGoodAddException if a matching miic safeguard good add could not be found
	 */
	@Override
	public MiicSafeguardGoodAdd findBygetMiicById_First(
			long miicApplicationId,
			OrderByComparator<MiicSafeguardGoodAdd> orderByComparator)
		throws NoSuchMiicSafeguardGoodAddException {

		MiicSafeguardGoodAdd miicSafeguardGoodAdd = fetchBygetMiicById_First(
			miicApplicationId, orderByComparator);

		if (miicSafeguardGoodAdd != null) {
			return miicSafeguardGoodAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("miicApplicationId=");
		sb.append(miicApplicationId);

		sb.append("}");

		throw new NoSuchMiicSafeguardGoodAddException(sb.toString());
	}

	/**
	 * Returns the first miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic safeguard good add, or <code>null</code> if a matching miic safeguard good add could not be found
	 */
	@Override
	public MiicSafeguardGoodAdd fetchBygetMiicById_First(
		long miicApplicationId,
		OrderByComparator<MiicSafeguardGoodAdd> orderByComparator) {

		List<MiicSafeguardGoodAdd> list = findBygetMiicById(
			miicApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic safeguard good add
	 * @throws NoSuchMiicSafeguardGoodAddException if a matching miic safeguard good add could not be found
	 */
	@Override
	public MiicSafeguardGoodAdd findBygetMiicById_Last(
			long miicApplicationId,
			OrderByComparator<MiicSafeguardGoodAdd> orderByComparator)
		throws NoSuchMiicSafeguardGoodAddException {

		MiicSafeguardGoodAdd miicSafeguardGoodAdd = fetchBygetMiicById_Last(
			miicApplicationId, orderByComparator);

		if (miicSafeguardGoodAdd != null) {
			return miicSafeguardGoodAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("miicApplicationId=");
		sb.append(miicApplicationId);

		sb.append("}");

		throw new NoSuchMiicSafeguardGoodAddException(sb.toString());
	}

	/**
	 * Returns the last miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic safeguard good add, or <code>null</code> if a matching miic safeguard good add could not be found
	 */
	@Override
	public MiicSafeguardGoodAdd fetchBygetMiicById_Last(
		long miicApplicationId,
		OrderByComparator<MiicSafeguardGoodAdd> orderByComparator) {

		int count = countBygetMiicById(miicApplicationId);

		if (count == 0) {
			return null;
		}

		List<MiicSafeguardGoodAdd> list = findBygetMiicById(
			miicApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the miic safeguard good adds before and after the current miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicSafeguardGoodAddId the primary key of the current miic safeguard good add
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic safeguard good add
	 * @throws NoSuchMiicSafeguardGoodAddException if a miic safeguard good add with the primary key could not be found
	 */
	@Override
	public MiicSafeguardGoodAdd[] findBygetMiicById_PrevAndNext(
			long miicSafeguardGoodAddId, long miicApplicationId,
			OrderByComparator<MiicSafeguardGoodAdd> orderByComparator)
		throws NoSuchMiicSafeguardGoodAddException {

		MiicSafeguardGoodAdd miicSafeguardGoodAdd = findByPrimaryKey(
			miicSafeguardGoodAddId);

		Session session = null;

		try {
			session = openSession();

			MiicSafeguardGoodAdd[] array = new MiicSafeguardGoodAddImpl[3];

			array[0] = getBygetMiicById_PrevAndNext(
				session, miicSafeguardGoodAdd, miicApplicationId,
				orderByComparator, true);

			array[1] = miicSafeguardGoodAdd;

			array[2] = getBygetMiicById_PrevAndNext(
				session, miicSafeguardGoodAdd, miicApplicationId,
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

	protected MiicSafeguardGoodAdd getBygetMiicById_PrevAndNext(
		Session session, MiicSafeguardGoodAdd miicSafeguardGoodAdd,
		long miicApplicationId,
		OrderByComparator<MiicSafeguardGoodAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_MIICSAFEGUARDGOODADD_WHERE);

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
			sb.append(MiicSafeguardGoodAddModelImpl.ORDER_BY_JPQL);
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
						miicSafeguardGoodAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiicSafeguardGoodAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the miic safeguard good adds where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 */
	@Override
	public void removeBygetMiicById(long miicApplicationId) {
		for (MiicSafeguardGoodAdd miicSafeguardGoodAdd :
				findBygetMiicById(
					miicApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(miicSafeguardGoodAdd);
		}
	}

	/**
	 * Returns the number of miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic safeguard good adds
	 */
	@Override
	public int countBygetMiicById(long miicApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMiicById;

		Object[] finderArgs = new Object[] {miicApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICSAFEGUARDGOODADD_WHERE);

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
		"miicSafeguardGoodAdd.miicApplicationId = ?";

	public MiicSafeguardGoodAddPersistenceImpl() {
		setModelClass(MiicSafeguardGoodAdd.class);

		setModelImplClass(MiicSafeguardGoodAddImpl.class);
		setModelPKClass(long.class);

		setTable(MiicSafeguardGoodAddTable.INSTANCE);
	}

	/**
	 * Caches the miic safeguard good add in the entity cache if it is enabled.
	 *
	 * @param miicSafeguardGoodAdd the miic safeguard good add
	 */
	@Override
	public void cacheResult(MiicSafeguardGoodAdd miicSafeguardGoodAdd) {
		entityCache.putResult(
			MiicSafeguardGoodAddImpl.class,
			miicSafeguardGoodAdd.getPrimaryKey(), miicSafeguardGoodAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the miic safeguard good adds in the entity cache if it is enabled.
	 *
	 * @param miicSafeguardGoodAdds the miic safeguard good adds
	 */
	@Override
	public void cacheResult(List<MiicSafeguardGoodAdd> miicSafeguardGoodAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miicSafeguardGoodAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiicSafeguardGoodAdd miicSafeguardGoodAdd :
				miicSafeguardGoodAdds) {

			if (entityCache.getResult(
					MiicSafeguardGoodAddImpl.class,
					miicSafeguardGoodAdd.getPrimaryKey()) == null) {

				cacheResult(miicSafeguardGoodAdd);
			}
		}
	}

	/**
	 * Clears the cache for all miic safeguard good adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiicSafeguardGoodAddImpl.class);

		finderCache.clearCache(MiicSafeguardGoodAddImpl.class);
	}

	/**
	 * Clears the cache for the miic safeguard good add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MiicSafeguardGoodAdd miicSafeguardGoodAdd) {
		entityCache.removeResult(
			MiicSafeguardGoodAddImpl.class, miicSafeguardGoodAdd);
	}

	@Override
	public void clearCache(List<MiicSafeguardGoodAdd> miicSafeguardGoodAdds) {
		for (MiicSafeguardGoodAdd miicSafeguardGoodAdd :
				miicSafeguardGoodAdds) {

			entityCache.removeResult(
				MiicSafeguardGoodAddImpl.class, miicSafeguardGoodAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiicSafeguardGoodAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiicSafeguardGoodAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new miic safeguard good add with the primary key. Does not add the miic safeguard good add to the database.
	 *
	 * @param miicSafeguardGoodAddId the primary key for the new miic safeguard good add
	 * @return the new miic safeguard good add
	 */
	@Override
	public MiicSafeguardGoodAdd create(long miicSafeguardGoodAddId) {
		MiicSafeguardGoodAdd miicSafeguardGoodAdd =
			new MiicSafeguardGoodAddImpl();

		miicSafeguardGoodAdd.setNew(true);
		miicSafeguardGoodAdd.setPrimaryKey(miicSafeguardGoodAddId);

		miicSafeguardGoodAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return miicSafeguardGoodAdd;
	}

	/**
	 * Removes the miic safeguard good add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicSafeguardGoodAddId the primary key of the miic safeguard good add
	 * @return the miic safeguard good add that was removed
	 * @throws NoSuchMiicSafeguardGoodAddException if a miic safeguard good add with the primary key could not be found
	 */
	@Override
	public MiicSafeguardGoodAdd remove(long miicSafeguardGoodAddId)
		throws NoSuchMiicSafeguardGoodAddException {

		return remove((Serializable)miicSafeguardGoodAddId);
	}

	/**
	 * Removes the miic safeguard good add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the miic safeguard good add
	 * @return the miic safeguard good add that was removed
	 * @throws NoSuchMiicSafeguardGoodAddException if a miic safeguard good add with the primary key could not be found
	 */
	@Override
	public MiicSafeguardGoodAdd remove(Serializable primaryKey)
		throws NoSuchMiicSafeguardGoodAddException {

		Session session = null;

		try {
			session = openSession();

			MiicSafeguardGoodAdd miicSafeguardGoodAdd =
				(MiicSafeguardGoodAdd)session.get(
					MiicSafeguardGoodAddImpl.class, primaryKey);

			if (miicSafeguardGoodAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiicSafeguardGoodAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miicSafeguardGoodAdd);
		}
		catch (NoSuchMiicSafeguardGoodAddException noSuchEntityException) {
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
	protected MiicSafeguardGoodAdd removeImpl(
		MiicSafeguardGoodAdd miicSafeguardGoodAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miicSafeguardGoodAdd)) {
				miicSafeguardGoodAdd = (MiicSafeguardGoodAdd)session.get(
					MiicSafeguardGoodAddImpl.class,
					miicSafeguardGoodAdd.getPrimaryKeyObj());
			}

			if (miicSafeguardGoodAdd != null) {
				session.delete(miicSafeguardGoodAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miicSafeguardGoodAdd != null) {
			clearCache(miicSafeguardGoodAdd);
		}

		return miicSafeguardGoodAdd;
	}

	@Override
	public MiicSafeguardGoodAdd updateImpl(
		MiicSafeguardGoodAdd miicSafeguardGoodAdd) {

		boolean isNew = miicSafeguardGoodAdd.isNew();

		if (!(miicSafeguardGoodAdd instanceof MiicSafeguardGoodAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miicSafeguardGoodAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miicSafeguardGoodAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miicSafeguardGoodAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiicSafeguardGoodAdd implementation " +
					miicSafeguardGoodAdd.getClass());
		}

		MiicSafeguardGoodAddModelImpl miicSafeguardGoodAddModelImpl =
			(MiicSafeguardGoodAddModelImpl)miicSafeguardGoodAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miicSafeguardGoodAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				miicSafeguardGoodAdd.setCreateDate(date);
			}
			else {
				miicSafeguardGoodAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miicSafeguardGoodAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miicSafeguardGoodAdd.setModifiedDate(date);
			}
			else {
				miicSafeguardGoodAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miicSafeguardGoodAdd);
			}
			else {
				miicSafeguardGoodAdd = (MiicSafeguardGoodAdd)session.merge(
					miicSafeguardGoodAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiicSafeguardGoodAddImpl.class, miicSafeguardGoodAddModelImpl,
			false, true);

		if (isNew) {
			miicSafeguardGoodAdd.setNew(false);
		}

		miicSafeguardGoodAdd.resetOriginalValues();

		return miicSafeguardGoodAdd;
	}

	/**
	 * Returns the miic safeguard good add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the miic safeguard good add
	 * @return the miic safeguard good add
	 * @throws NoSuchMiicSafeguardGoodAddException if a miic safeguard good add with the primary key could not be found
	 */
	@Override
	public MiicSafeguardGoodAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiicSafeguardGoodAddException {

		MiicSafeguardGoodAdd miicSafeguardGoodAdd = fetchByPrimaryKey(
			primaryKey);

		if (miicSafeguardGoodAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiicSafeguardGoodAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miicSafeguardGoodAdd;
	}

	/**
	 * Returns the miic safeguard good add with the primary key or throws a <code>NoSuchMiicSafeguardGoodAddException</code> if it could not be found.
	 *
	 * @param miicSafeguardGoodAddId the primary key of the miic safeguard good add
	 * @return the miic safeguard good add
	 * @throws NoSuchMiicSafeguardGoodAddException if a miic safeguard good add with the primary key could not be found
	 */
	@Override
	public MiicSafeguardGoodAdd findByPrimaryKey(long miicSafeguardGoodAddId)
		throws NoSuchMiicSafeguardGoodAddException {

		return findByPrimaryKey((Serializable)miicSafeguardGoodAddId);
	}

	/**
	 * Returns the miic safeguard good add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicSafeguardGoodAddId the primary key of the miic safeguard good add
	 * @return the miic safeguard good add, or <code>null</code> if a miic safeguard good add with the primary key could not be found
	 */
	@Override
	public MiicSafeguardGoodAdd fetchByPrimaryKey(long miicSafeguardGoodAddId) {
		return fetchByPrimaryKey((Serializable)miicSafeguardGoodAddId);
	}

	/**
	 * Returns all the miic safeguard good adds.
	 *
	 * @return the miic safeguard good adds
	 */
	@Override
	public List<MiicSafeguardGoodAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic safeguard good adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @return the range of miic safeguard good adds
	 */
	@Override
	public List<MiicSafeguardGoodAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic safeguard good adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic safeguard good adds
	 */
	@Override
	public List<MiicSafeguardGoodAdd> findAll(
		int start, int end,
		OrderByComparator<MiicSafeguardGoodAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic safeguard good adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic safeguard good adds
	 */
	@Override
	public List<MiicSafeguardGoodAdd> findAll(
		int start, int end,
		OrderByComparator<MiicSafeguardGoodAdd> orderByComparator,
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

		List<MiicSafeguardGoodAdd> list = null;

		if (useFinderCache) {
			list = (List<MiicSafeguardGoodAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MIICSAFEGUARDGOODADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MIICSAFEGUARDGOODADD;

				sql = sql.concat(MiicSafeguardGoodAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiicSafeguardGoodAdd>)QueryUtil.list(
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
	 * Removes all the miic safeguard good adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiicSafeguardGoodAdd miicSafeguardGoodAdd : findAll()) {
			remove(miicSafeguardGoodAdd);
		}
	}

	/**
	 * Returns the number of miic safeguard good adds.
	 *
	 * @return the number of miic safeguard good adds
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
					_SQL_COUNT_MIICSAFEGUARDGOODADD);

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
		return "miicSafeguardGoodAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MIICSAFEGUARDGOODADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiicSafeguardGoodAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the miic safeguard good add persistence.
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

		MiicSafeguardGoodAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiicSafeguardGoodAddUtil.setPersistence(null);

		entityCache.removeCache(MiicSafeguardGoodAddImpl.class.getName());
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

	private static final String _SQL_SELECT_MIICSAFEGUARDGOODADD =
		"SELECT miicSafeguardGoodAdd FROM MiicSafeguardGoodAdd miicSafeguardGoodAdd";

	private static final String _SQL_SELECT_MIICSAFEGUARDGOODADD_WHERE =
		"SELECT miicSafeguardGoodAdd FROM MiicSafeguardGoodAdd miicSafeguardGoodAdd WHERE ";

	private static final String _SQL_COUNT_MIICSAFEGUARDGOODADD =
		"SELECT COUNT(miicSafeguardGoodAdd) FROM MiicSafeguardGoodAdd miicSafeguardGoodAdd";

	private static final String _SQL_COUNT_MIICSAFEGUARDGOODADD_WHERE =
		"SELECT COUNT(miicSafeguardGoodAdd) FROM MiicSafeguardGoodAdd miicSafeguardGoodAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miicSafeguardGoodAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiicSafeguardGoodAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiicSafeguardGoodAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiicSafeguardGoodAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}